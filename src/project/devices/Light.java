package project.devices;

public class Light extends Device {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void adjustBrightness(int newBrightness) {
        if (isOn) {
            brightness = newBrightness;
        }
    }

    @Override
    public String getDeviceDetails() {
        return "Brightness: " + brightness + "%";
    }
}
