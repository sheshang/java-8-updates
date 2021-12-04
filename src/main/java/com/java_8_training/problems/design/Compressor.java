package com.java_8_training.problems.design;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Compressor {

    private final CompressionStrategy strategy;

    public Compressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(Path inFile, File outFile) throws IOException {
        try (OutputStream outStream = new FileOutputStream(outFile);
             OutputStream compressedStream = strategy.compress(outStream)) {
            Files.copy(inFile, compressedStream);
        }
    }

    public static void compressGzip(Path inFile, File outFile) throws IOException {
        compress(inFile, outFile, (data) -> new GZIPOutputStream(data));
    }

    public static void compressZip(Path inFile, File outFile) throws IOException {
        compress(inFile, outFile, (data) -> new ZipOutputStream(data));
    }

    private static void compress(Path inFile, File outFile, CompressionStrategy strategy) throws IOException {
        Compressor zipCompressor = new Compressor(strategy);
        zipCompressor.compress(inFile, outFile);
    }

}
