package com.java_8_training.problems.design;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * This interface models a function which processes lines - potentially of a file.
 */
@FunctionalInterface
public interface LinesProcessor {

    void process(Stream<String> lines);

    public static void processFile(String file, LinesProcessor processor) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Get a stream of all the lines from the buffered reader
            processor.process(reader.lines());
        }
    }

}
