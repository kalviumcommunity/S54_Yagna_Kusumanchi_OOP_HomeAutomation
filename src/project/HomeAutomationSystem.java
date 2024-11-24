package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Demonstrating Polymorphism ----");

        // Runtime polymorphism with method overriding
        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);

        livingRoomLight.turnOn();
        bedroomFan.turnOn();

        livingRoomLight.displayStatus(); // Calls overridden method in Light
        bedroomFan.displayStatus();     // Calls overridden method in Fan

        System.out.println();

        // Compile-time polymorphism with method overloading
        livingRoomLight.turnOff();
        livingRoomLight.turnOn(5); // Calls overloaded method with delay

        System.out.println();

        // Using polymorphic behavior in arrays
        Device[] devices = {livingRoomLight, bedroomFan};
        for (Device device : devices) {
            device.displayStatus(); // Calls the overridden method based on the object type
        }
    }
}
