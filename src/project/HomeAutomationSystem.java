package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        
        // Creating a Light object
        Light livingRoomLight = new Light("Living Room Light", 70);
        livingRoomLight.displayStatus();
        livingRoomLight.turnOn();
        livingRoomLight.adjustBrightness(85);
        livingRoomLight.displayStatus();

        System.out.println();

        // Creating a Fan object
        Fan bedroomFan = new Fan("Bedroom Fan", 3);
        bedroomFan.displayStatus();
        bedroomFan.turnOn();
        bedroomFan.adjustSpeed(5);
        bedroomFan.displayStatus();

        System.out.println();

        // Demonstrating polymorphism
        Device genericDevice = new Light("Generic Light", 60); // A Light is also a Device
        genericDevice.turnOn();
        genericDevice.displayStatus();
        System.out.println("(This object uses inherited methods and overrides.)");
    }
}
