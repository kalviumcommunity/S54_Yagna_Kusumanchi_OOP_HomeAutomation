package project.devices;

// Abstract class to represent a generic device
public abstract class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    // Concrete method (common functionality for all devices)
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(name + " is now OFF.");
        } else {
            System.out.println(name + " is already OFF.");
        }
    }

    // Abstract method (virtual function) to be implemented by subclasses
    public abstract void displayStatus();
}
