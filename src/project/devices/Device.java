package project.devices;

public class Device {
    protected String name;
    protected boolean isOn;

    private static int totalDevices = 0;

    // Default constructor
    public Device() {
        this.name = "Unknown Device";
        this.isOn = false;
        totalDevices++;
        System.out.println("Default constructor called for Device.");
    }

    // Parameterized constructor
    public Device(String name) {
        this.name = name;
        this.isOn = false;
        totalDevices++;
        System.out.println("Parameterized constructor called for " + name + ".");
    }

    // Copy constructor (Simulating by manually copying fields)
    public Device(Device other) {
        this.name = other.name;
        this.isOn = other.isOn;
        totalDevices++;
        System.out.println("Copy constructor called for " + name + ".");
    }

    // Destructor simulation (cleanup logic)
    public void cleanup() {
        totalDevices--;
        System.out.println("Cleanup called for " + name + ". Remaining devices: " + totalDevices);
    }

    // Methods
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

    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }

    // Static method
    public static int getTotalDevices() {
        return totalDevices;
    }
}
