import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    void testGetRedColourFloat(){
        Colour colour = new Colour(1,0, 0);
        assertEquals(1, colour.getRedColour());
    }

    @Test
    void testGetGreenColourFloat(){
        Colour colour = new Colour(0,1, 0);
        assertEquals(1, colour.getGreenColour());
    }

    @Test
    void testGetBlueColourFloat(){
        Colour colour = new Colour(0,0, 1);
        assertEquals(1, colour.getBlueColour());
    }

    @Test
    void testGetRedColourString(){
        Colour colour = new Colour("100000000000000000000000");
        assertEquals(1, colour.getRedColour());
    }

    @Test
    void testGetGreenColourString(){
        Colour colour = new Colour("000000001000000000000000");
        assertEquals(1, colour.getGreenColour());
    }

    @Test
    void testGetBlueColourString(){
        Colour colour = new Colour("000000000000000010000000");
        assertEquals(1, colour.getBlueColour());
    }

    @Test
    void testGetColourIndexException(){

        Exception exception = assertThrows(StringIndexOutOfBoundsException.class,
                () -> {Colour colour = new Colour("5");});
        String actualMessage = exception.getMessage();
        String expectedMessage = "Range [0, 8) out of bounds for length 1";

        assertEquals(expectedMessage, actualMessage);

    }

    @Test
    void testGetColourNumberFormatException(){

        Exception exception = assertThrows(NumberFormatException.class,
                () -> {Colour colour = new Colour("555555555555555555555555555");});
        String actualMessage = exception.getMessage();
        String expectedMessage = "For input string: \"55555555\" under radix 2";
        System.out.println(actualMessage);
    }
}