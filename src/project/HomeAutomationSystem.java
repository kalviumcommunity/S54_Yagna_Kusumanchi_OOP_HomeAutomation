package project;

import project.devices.*;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Demonstrating Open/Closed Principle ----");

        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);
        Device thermostat = new SmartThermostat("Living Room Thermostat", 22);
        Device securityCamera = new SecurityCamera("Front Door Camera");

        // Turning devices on
        livingRoomLight.turnOn();
        bedroomFan.turnOn();
        thermostat.turnOn();
        securityCamera.turnOn();

        // Adjusting properties
        ((Light) livingRoomLight).adjustBrightness(90);
        ((Fan) bedroomFan).adjustSpeed(5);
        ((SmartThermostat) thermostat).setTemperature(25);
        ((SecurityCamera) securityCamera).startRecording();

        // Displaying statuses
        displayDeviceStatus(livingRoomLight);
        displayDeviceStatus(bedroomFan);
        displayDeviceStatus(thermostat);
        displayDeviceStatus(securityCamera);

        System.out.println("\nTurning off all devices...\n");

        // Turning off devices
        livingRoomLight.turnOff();
        bedroomFan.turnOff();
        thermostat.turnOff();
        securityCamera.turnOff();

        // Displaying statuses again
        displayDeviceStatus(livingRoomLight);
        displayDeviceStatus(bedroomFan);
        displayDeviceStatus(thermostat);
        displayDeviceStatus(securityCamera);
    }

    // Method to display device status
    public static void displayDeviceStatus(Device device) {
        System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF") + ". " + device.getDeviceDetails());
    }
}
