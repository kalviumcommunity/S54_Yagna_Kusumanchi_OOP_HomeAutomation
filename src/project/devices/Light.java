package project.devices;

public class Light extends Device {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (isOn()) {
            this.brightness = brightness;
            System.out.println(getName() + " brightness adjusted to " + brightness + "%.");
        } else {
            System.out.println(getName() + " is OFF. Cannot adjust brightness.");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        if (isOn()) {
            System.out.println("Brightness: " + brightness + "%");
        }
    }
}
