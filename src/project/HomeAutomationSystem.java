package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        Device[] devices = new Device[4];
        
        devices[0] = new Light("Living Room Light", 70);
        devices[1] = new Fan("Bedroom Fan", 3);
        devices[2] = new Light("Kitchen Light", 50);
        devices[3] = new Fan("Office Fan", 2);

        System.out.println("Initial Status of Devices:");
        for (Device device : devices) {
            device.displayStatus();
        }

        System.out.println("\nTurning on all devices:");
        for (Device device : devices) {
            device.turnOn();
        }

        System.out.println("\nAdjusting the settings for Lights and Fans:");
        for (Device device : devices) {
            if (device instanceof Light) {
                ((Light) device).adjustBrightness(80);  
            } else if (device instanceof Fan) {
                ((Fan) device).adjustSpeed(5);  
            }
        }

        System.out.println("\nFinal Status of Devices:");
        for (Device device : devices) {
            device.displayStatus();
        }
    }
}