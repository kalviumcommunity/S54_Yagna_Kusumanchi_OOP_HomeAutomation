package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Constructor Demonstration ----");
        
        // Using parameterized constructor
        Light livingRoomLight = new Light("Living Room Light", 70);
        Fan bedroomFan = new Fan("Bedroom Fan", 3);

        // Using default constructor
        Device genericDevice = new Device();

        // Using copy constructor
        Device copiedDevice = new Device(livingRoomLight);

        System.out.println("\n---- Device Operations ----");

        livingRoomLight.turnOn();
        livingRoomLight.adjustBrightness(90);
        livingRoomLight.displayStatus();

        System.out.println();

        bedroomFan.turnOn();
        bedroomFan.adjustSpeed(5);
        bedroomFan.displayStatus();

        System.out.println();

        livingRoomLight.turnOff();
        bedroomFan.turnOff();

        System.out.println("\nTotal devices created: " + Device.getTotalDevices());

        System.out.println("\n---- Destructor Simulation ----");
        livingRoomLight.cleanup();
        bedroomFan.cleanup();
        genericDevice.cleanup();
        copiedDevice.cleanup();

        System.out.println("Final device count: " + Device.getTotalDevices());
    }
}
