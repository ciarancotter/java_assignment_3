import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    void testGetRedColourFloat() throws IncorrectRGBFloatException {
        Colour colour = new Colour(1,0, 0);
        assertEquals(1, colour.getRedColour());
    }

    @Test
    void testGetGreenColourFloat() throws IncorrectRGBFloatException {
        Colour colour = new Colour(0,1, 0);
        assertEquals(1, colour.getGreenColour());
    }

    @Test
    void testGetBlueColourFloat() throws IncorrectRGBFloatException {
        Colour colour = new Colour(0,0, 1);
        assertEquals(1, colour.getBlueColour());
    }

    @Test
    void testGetRedColourString() throws InvalidCharacterException {
        Colour colour = new Colour("100000000000000000000000");
        assertEquals(1, colour.getRedColour());
    }

    @Test
    void testGetGreenColourString() throws InvalidCharacterException {
        Colour colour = new Colour("000000001000000000000000");
        assertEquals(1, colour.getGreenColour());
    }

    @Test
    void testGetBlueColourString() throws InvalidCharacterException {
        Colour colour = new Colour("000000000000000010000000");
        assertEquals(1, colour.getBlueColour());
    }

    @Test
    void testGetColourIndexException(){

        Exception exception = assertThrows(StringIndexOutOfBoundsException.class,
                () -> {Colour colour = new Colour("111111111");});
        String actualMessage = exception.getMessage();
        String expectedMessage = "out of bounds";
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testIncorrectFloatException(){

        Exception exception = assertThrows(IncorrectRGBFloatException.class,
                () -> {Colour colour = new Colour(0f, 1.5f, 0f);});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Float values should be between 0 and 1.";
        System.out.println(actualMessage);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testInvalidCharactersException(){

        Exception exception = assertThrows(InvalidCharacterException.class,
                () -> {Colour colour = new Colour("500000000000000000000000");});
        String actualMessage = exception.getMessage();
        String expectedMessage = "String characters should be either 0 or 1.";
        System.out.println(actualMessage);
        assertEquals(expectedMessage, actualMessage);
    }
}