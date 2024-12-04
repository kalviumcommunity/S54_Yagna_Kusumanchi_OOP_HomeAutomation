package project.devices;

// Abstract class to represent a generic device
public abstract class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getDeviceDetails();
}
