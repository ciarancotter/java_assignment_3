import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    void testGetRedColour(){
        Colour colour = new Colour(1,0, 0);
        assertEquals(1, colour.getRedColour());
    }

    @Test
    void testGetGreenColour(){
        Colour colour = new Colour(0,1, 0);
        assertEquals(1, colour.getGreenColour());
    }

    @Test
    void testGetBlueColour(){
        Colour colour = new Colour(0,0, 1);
        assertEquals(1, colour.getBlueColour());
    }
}