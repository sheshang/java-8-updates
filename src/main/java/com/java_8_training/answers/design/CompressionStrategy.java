package com.java_8_training.answers.design;

import java.io.IOException;
import java.io.OutputStream;

public interface CompressionStrategy {

    OutputStream compress(OutputStream data) throws IOException;

}
