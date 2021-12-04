package com.java_8_training.problems.lambdas;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.DosFileAttributeView;

import static junit.framework.Assert.assertEquals;

@Ignore
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
        // TODO: find hidden files, tip: mainDirectory.listFiles();
        File[] files = null;
        assertEquals(2, files.length);
    }

    @Test
    public void xmlFiles() {
        // TODO: Find XML files,
        File[] files = null;
        assertEquals(1, files.length);
    }
}
