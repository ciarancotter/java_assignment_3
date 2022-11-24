import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    void testGetRedColourFloat(){
        Colour colour = new Colour(1,0, 0);
        assertEquals(1, colour.getRedColourFloat());
    }

    @Test
    void testGetGreenColourFloat(){
        Colour colour = new Colour(0,1, 0);
        assertEquals(1, colour.getGreenColourFloat());
    }

    @Test
    void testGetBlueColourFloat(){
        Colour colour = new Colour(0,0, 1);
        assertEquals(1, colour.getBlueColourFloat());
    }

    @Test
    void testGetRedBits(){
        Colour colour = new Colour("100000000000000000000000");
        assertEquals(128, colour.getRedBits());
    }

    @Test
    void testGetGreenBits(){
        Colour colour = new Colour("000000001000000000000000");
        assertEquals(128, colour.getGreenBits());
    }

    @Test
    void testGetBlueBits(){
        Colour colour = new Colour("000000000000000010000000");
        assertEquals(128, colour.getBlueBits());
    }
}