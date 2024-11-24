package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        User admin = new User("Alice", "Admin");
        admin.displayUserInfo();
        System.out.println();

        Device livingRoomLight = new Light("Living Room Light", 70);
        Device bedroomFan = new Fan("Bedroom Fan", 3);

        livingRoomLight.displayStatus();
        livingRoomLight.turnOn();
        ((Light) livingRoomLight).setBrightness(90);
        livingRoomLight.displayStatus();

        System.out.println();

        bedroomFan.displayStatus();
        bedroomFan.turnOn();
        ((Fan) bedroomFan).setSpeed(5);
        bedroomFan.displayStatus();

        System.out.println();

        livingRoomLight.turnOff();
        bedroomFan.turnOff();

        System.out.println("Total devices created: " + Device.getTotalDevices());
        System.out.println("Total power usage: " + Device.getTotalPowerUsage() + " units");
    }
}
