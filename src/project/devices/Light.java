package project.devices;

public class Light extends Device {
    private int brightness;

    public Light(String name, int brightness) {
        super(name); // Calling the parent class constructor
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

    // Implementing the abstract method
    @Override
    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}
