import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    void testGetRed(){
        Colour colour = new Colour(0,0, 0);
        assertEquals(0, colour.getRedColour());
    }
}