package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;
import project.util.DeviceFormatter;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println("---- Demonstrating Single Responsibility Principle ----");

        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);

        // Turning devices on
        livingRoomLight.turnOn();
        bedroomFan.turnOn();

        // Adjusting properties
        ((Light) livingRoomLight).adjustBrightness(90);
        ((Fan) bedroomFan).adjustSpeed(5);

        // Displaying device statuses
        System.out.println(DeviceFormatter.formatDeviceStatus(livingRoomLight));
        System.out.println(DeviceFormatter.formatDeviceStatus(bedroomFan));

        System.out.println();

        // Turning devices off
        livingRoomLight.turnOff();
        bedroomFan.turnOff();

        // Displaying device statuses again
        System.out.println(DeviceFormatter.formatDeviceStatus(livingRoomLight));
        System.out.println(DeviceFormatter.formatDeviceStatus(bedroomFan));
    }
}
