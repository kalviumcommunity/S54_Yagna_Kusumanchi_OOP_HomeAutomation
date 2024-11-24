package project.devices;

public class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    // Method to demonstrate compile-time polymorphism (method overloading)
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is now ON.");
        } else {
            System.out.println(name + " is already ON.");
        }
    }

    public void turnOn(int delayInSeconds) {
        System.out.println("Turning on " + name + " after a delay of " + delayInSeconds + " seconds...");
        isOn = true;
        System.out.println(name + " is now ON.");
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
}
