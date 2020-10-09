import org.junit.Before;
import org.junit.Test;
import se.addq.java4test.Person;

import static org.mockito.Mockito.*;

public class MockTest {

    Person p = mock(Person.class);

    @Before
    public void setup () {
        when(p.getName()).thenReturn("Mats");
    }

    @Test
    public void aTest() {
       
        System.out.println(p.getName());
    }

    @Test
    public void aSecondTest() {
        System.out.println(p.getName());
    }




}
