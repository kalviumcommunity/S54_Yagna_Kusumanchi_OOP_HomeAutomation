package project;

import project.devices.Device;
import project.devices.Fan;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        Device fan = new Fan("Bedroom Fan", 3);

        fan.displayStatus();

        fan.turnOn();

        ((Fan) fan).adjustSpeed(4);

        fan.displayStatus();
    }
}