package se.addq.java4test;

import org.junit.Test;

import static org.junit.Assert.*;

public class JsonExampleTest {

    @Test
    public void getName() {
        JsonExample jsonExample = new JsonExample();
        System.out.println(jsonExample.getName());
    }
}
