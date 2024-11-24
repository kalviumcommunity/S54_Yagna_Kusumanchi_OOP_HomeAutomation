package project.devices;

// Abstract class representing the concept of a Device
public abstract class AbstractDevice {
    protected String name; // Name of the device
    protected boolean isOn; // On/Off status

    // Constructor
    public AbstractDevice(String name) {
        this.name = name;
        this.isOn = false; // Default to OFF
    }

    // Abstract methods to be implemented by all concrete device types
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void displayStatus();
}
