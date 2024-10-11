package project.devices;

public class Device {
    protected String name;
    protected boolean isOn;

    private static int totalDevices = 0; // To track the total number of devices created
    private static int totalPowerUsage = 0; // To track total power usage across all devices

    public Device(String name) {
        this.name = name;
        this.isOn = false;  
        totalDevices++; 
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public static int getTotalPowerUsage() {
        return totalPowerUsage;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            totalPowerUsage += 10; // Assume each device uses 10 units of power when on
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            totalPowerUsage -= 10; // Reduce power usage when the device is turned off
            System.out.println(name + " is now OFF.");
        } else {
            System.out.println(name + " is already OFF.");
        }
    }

    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }
}
