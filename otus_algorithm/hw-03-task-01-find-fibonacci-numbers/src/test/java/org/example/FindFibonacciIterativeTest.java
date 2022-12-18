package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class FindFibonacciIterativeTest {

    private static Set<Path> getListFiles(String dir) throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .filter(x -> !x.getFileName().toString().equals("problem.txt"))
                    .collect(Collectors.toSet());
        }
    }

    private static Stream<Arguments> argumentsStream() throws IOException {

        String testsPath = "src/test/resources";
        Set<Path> listFiles = FindFibonacciIterativeTest.getListFiles(testsPath);

        int testsCount = listFiles.size() / 2;

        String[] in = new String[testsCount];
        String[] out = new String[testsCount];

        for (Path file : listFiles) {
            String textFromFile = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            if (file.getFileName().toString().endsWith(".in")) {
                Integer testNumber = Integer.parseInt(file.getFileName().toString().replace("test.", "").replace(".in", ""));
                in[testNumber] = textFromFile;
            } else {
                Integer testNumber = Integer.parseInt(file.getFileName().toString().replace("test.", "").replace(".out", ""));
                out[testNumber] = textFromFile;
            }
        }

        List<Arguments> arguments = new ArrayList<>();
        for (int i = 0; i < testsCount; i++) {
            String[] inLines = in[i].split("\n");
            arguments.add(Arguments.of(inLines[0], out[i]));
        }

        return Stream.of(
                arguments.get(0),
                arguments.get(1),
                arguments.get(2),
                arguments.get(3),
                arguments.get(4),
                arguments.get(5),
                arguments.get(6),
                arguments.get(7),
                arguments.get(8),
                arguments.get(9),
                arguments.get(10),
                arguments.get(11),
                arguments.get(12));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void testIterativeMethod(String position, String expected) {
        Assertions.assertEquals(expected, FindFibonacciIterative.find(Integer.parseInt(position)));
    }
}