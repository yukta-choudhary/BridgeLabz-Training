package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.FileProcessor;

import java.io.File;
import java.io.IOException;

class FileProcessorTest {

    FileProcessor fp = new FileProcessor();

    @Test
    void testFileWriteRead() throws Exception {
        String file = "test.txt";
        fp.writeToFile(file, "Hello");

        assertTrue(new File(file).exists());
        assertEquals("Hello", fp.readFromFile(file));

        new File(file).delete();
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class,
                () -> fp.readFromFile("nofile.txt"));
    }
}
