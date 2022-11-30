public class Colour {
    private final float redColour;
    private final float greenColour;
    private final float blueColour;

    public Colour(float red, float green, float blue) throws IncorrectRGBFloatException{

        if (red >= 0f && red <= 1.0f) {
                redColour = red;
        } else{
            throw new IncorrectRGBFloatException();
        }
        if (green >= 0f && green <= 1.0f) {
            greenColour = green;
        } else {
            throw new IncorrectRGBFloatException();
        }
        if (blue >= 0f && blue <= 1.0f) {
            blueColour = blue;
        } else{
            throw new IncorrectRGBFloatException();
        }
    }

    public Colour(String bits) throws StringIndexOutOfBoundsException, InvalidCharacterException{

        char[] bitChars = bits.toCharArray();
        for (char bitChar : bitChars) {
            if (bitChar != '0' && bitChar != '1') {
                throw new InvalidCharacterException();
            }
        }

        int redBits = Integer.parseInt(bits.substring(0, 8), 2);
        int greenBits = Integer.parseInt(bits.substring(8, 16), 2);
        int blueBits = Integer.parseInt(bits.substring(16, 24), 2);

        redColour = redBits / 128;
        greenColour = greenBits / 128;
        blueColour = blueBits / 128;

    }

    public float getRedColour(){
        return redColour;
    }

    public float getGreenColour(){
        return greenColour;
    }

    public float getBlueColour(){
        return blueColour;
    }
}

class IncorrectRGBFloatException extends Exception {
    public IncorrectRGBFloatException(){
        super("Float values should be between 0 and 1.");
    }
}

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(){
        super("String characters should be either 0 or 1.");
    }
}