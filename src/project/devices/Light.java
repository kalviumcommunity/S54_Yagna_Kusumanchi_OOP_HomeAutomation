package project.devices;

public class Light extends Device {
    private int brightness;

    public Light(String name, int brightness) {
        super(name); // Calling the constructor of the parent class
        this.brightness = brightness;
    }

    public void adjustBrightness(int newBrightness) {
        if (isOn) {
            brightness = newBrightness;
            System.out.println(name + " brightness adjusted to " + brightness + "%.");
        } else {
            System.out.println(name + " is OFF. Cannot adjust brightness.");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Calling the parent class method
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}
