package com.java_8_training.answers.lambdas;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.DosFileAttributeView;

import static junit.framework.Assert.assertEquals;

public class WrapUpTest {

    private static final File mainDirectory = new File("src/test/resources/wrap_up");

    @BeforeClass
    public static void ensureHidden() throws IOException {
        if (System.getProperty("os.name").startsWith("Windows")) {
            for (File file : mainDirectory.listFiles()) {
                if (file.getName().startsWith(".")) {
                    DosFileAttributeView attributeView = Files.getFileAttributeView(
                            file.toPath(), DosFileAttributeView.class);
                    attributeView.setHidden(true);
                }
            }
        }
    }

    @Test
    public void hiddenFiles() {
        File[] files = mainDirectory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isHidden();
            }
        });
        assertEquals(2, files.length);
    }

    @Test
    public void xmlFiles() {
        File[] files = mainDirectory.listFiles(f -> f.getName().endsWith(".xml"));
        assertEquals(1, files.length);
    }
}
