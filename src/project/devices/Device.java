package project.devices;

public class Device extends AbstractDevice {
    private static int totalDevices = 0; // Static variable for tracking device count

    // Constructor
    public Device(String name) {
        super(name);
        totalDevices++; // Increment total devices when a new device is created
    }

    // Implementing abstract methods
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(name + " is now OFF.");
        } else {
            System.out.println(name + " is already OFF.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }

    // Static method to get total devices
    public static int getTotalDevices() {
        return totalDevices;
    }
}
