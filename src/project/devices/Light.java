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

    // Overriding the displayStatus method (runtime polymorphism)
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the parent method
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}
