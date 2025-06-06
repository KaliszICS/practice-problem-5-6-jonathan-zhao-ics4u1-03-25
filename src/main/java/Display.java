public class Display {
    private double sizeInches;
    private String resolution;

    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    public String turnOn() {
        return "Display turned on. " + "[" + sizeInches + "]-inch, [" + resolution + "]";
    }

    public String turnOff() {
        return "Display turned off";
    }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public String getResolution() {
        return this.resolution;
    }

    @Override
    public String toString() {
        return "Display: [" + sizeInches + "] inches, " + "[" + resolution + "]";
    }

}
