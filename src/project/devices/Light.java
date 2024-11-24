package project.devices;

public class Light extends Device {
    private int brightness;

    // Parameterized constructor
    public Light(String name, int brightness) {
        super(name);  // Call to the parent class constructor
        this.brightness = brightness;
    }

    // Adjust brightness
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
        super.displayStatus();
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}
