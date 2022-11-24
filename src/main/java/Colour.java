public class Colour {
    private float redColour;
    private float greenColour;
    private float blueColour;

    public Colour(float red, float green, float blue){
        redColour = red;
        greenColour = green;
        blueColour = blue;
    }

    public Colour(String bits){
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
