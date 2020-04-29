package ledTesting;

public class Led {
    private String colour;
    private String Working;

    public Led(String colour, String working) {
        this.colour = colour;
        Working = working;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getWorking() {
        return Working;
    }

    public void setWorking(String working) {

        Working = working;
    }
}
