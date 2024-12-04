package project;

import project.devices.*;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Demonstrating Liskov Substitution Principle ----");

        DeviceManager deviceManager = new DeviceManager();

        // Adding various devices
        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);
        Device thermostat = new SmartThermostat("Living Room Thermostat", 22);
        Device securityCamera = new SecurityCamera("Front Door Camera");

        deviceManager.addDevice(livingRoomLight);
        deviceManager.addDevice(bedroomFan);
        deviceManager.addDevice(thermostat);
        deviceManager.addDevice(securityCamera);

        // Turning all devices on
        System.out.println("\nTurning all devices ON...\n");
        deviceManager.turnAllDevicesOn();
        deviceManager.displayAllDeviceDetails();

        // Turning all devices off
        System.out.println("\nTurning all devices OFF...\n");
        deviceManager.turnAllDevicesOff();
        deviceManager.displayAllDeviceDetails();
    }
}
