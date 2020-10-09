package se.addq.java4test;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SimpleFileReaderTest {

    @Test
    public void readNames() throws IOException {
        SimpleFileReader fileReader = new SimpleFileReader();
        System.out.println(fileReader.readNames());
    }
}