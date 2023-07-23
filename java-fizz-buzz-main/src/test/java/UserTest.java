import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private InputStream originalSystemIn;

    @Before
    public void setUp() {
        originalSystemIn = System.in;
    }

    @After
    public void tearDown() {
        System.setIn(originalSystemIn);
    }

    @Test
    public void testSetNameFromInput() {
        // Arrange
        String userInput = "John";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        User user = new User();
        user.setNameFromInput();
        assertEquals("John", user.getName());
    }

    @Test
    public void testSetCounterFromInput() {

        String userInput = "10";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);

        User user = new User();
        user.setCounterFromInput();
        assertEquals(10, user.getCounter());
    }
}