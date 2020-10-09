package se.addq.java4test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class RomanSumTest {

    @Ignore ("Ignored test because this test will fail by design")
    @Test
    public void Return2BeforeRefactorShouldFail() {
        Assert.assertEquals("II","I");
    }

    @Test
    public void Return2() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("II", actual.romanSum("I", "I"));

    }

    @Test
    public void Return3() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("III", actual.romanSum("I", "II"));

    }
    @Test
    public void Return4() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("IV", actual.romanSum("II", "II"));

    }
    @Test
    public void Return5() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("V", actual.romanSum("I", "IV"));

    }
    @Test
    public void Return5on2plus3() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("V", actual.romanSum("II", "III"));

    }
    @Test
    public void Return7() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("VII", actual.romanSum("II", "V"));

    }
    @Test
    public void Return9() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("IX", actual.romanSum("IV", "V"));

    }
    @Test
    public void Return13() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("XIII", actual.romanSum("VI", "VII"));

    }

    @Test
    public void Return18() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("XVIII", actual.romanSum("IX", "IX"));
    }
    @Test
    public void Return34() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("XXXIV", actual.romanSum("XIX", "XV"));
    }
    @Test
    public void Return46() {
        RomanSum actual= new RomanSum();
        Assert.assertEquals("XLVI", actual.romanSum("XXII", "XXIV"));
    }
}
