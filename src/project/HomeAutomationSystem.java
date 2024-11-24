package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Demonstrating Abstract Class and Virtual Function ----");

        // Creating objects using the abstract class reference
        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);

        // Demonstrating polymorphic behavior
        livingRoomLight.turnOn();
        bedroomFan.turnOn();

        livingRoomLight.displayStatus(); // Calls Light's implementation of displayStatus
        bedroomFan.displayStatus();     // Calls Fan's implementation of displayStatus

        System.out.println();

        // Adjust properties
        ((Light) livingRoomLight).adjustBrightness(90);
        ((Fan) bedroomFan).adjustSpeed(5);

        livingRoomLight.displayStatus();
        bedroomFan.displayStatus();

        System.out.println();

        // Turning devices off
        livingRoomLight.turnOff();
        bedroomFan.turnOff();
    }
}
