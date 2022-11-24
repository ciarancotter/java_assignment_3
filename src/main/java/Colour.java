public class Colour {
    private float redColour;
    private float greenColour;
    private float blueColour;
    private int redBits;
    private int greenBits;
    private int blueBits;

    public Colour(float red, float green, float blue){
        redColour = red;
        greenColour = green;
        blueColour = blue;
    }

    public Colour(String bits){
        redBits = Integer.parseInt(bits.substring(0, 8), 2);
        greenBits = Integer.parseInt(bits.substring(8, 16), 2);
        blueBits = Integer.parseInt(bits.substring(16, 24), 2);
    }

    public int getRedBits(){
        return redBits;
    }

    public int getGreenBits(){
        return greenBits;
    }

    public int getBlueBits(){
        return blueBits;
    }

    public float getRedColourFloat(){
        return redColour;
    }

    public float getGreenColourFloat(){
        return greenColour;
    }

    public float getBlueColourFloat(){
        return blueColour;
    }
}
