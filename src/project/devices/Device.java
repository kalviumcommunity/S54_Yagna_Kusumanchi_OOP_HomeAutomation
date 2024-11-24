package project.devices;

public class Device {
    private String name; // Encapsulation
    private boolean isOn;

    private static int totalDevices = 0;
    private static int totalPowerUsage = 0;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
        totalDevices++;
    }

    // Public getters and setters for encapsulated fields
    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
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
            totalPowerUsage += 10;
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            totalPowerUsage -= 10;
            System.out.println(name + " is now OFF.");
        } else {
            System.out.println(name + " is already OFF.");
        }
    }

    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }
}
