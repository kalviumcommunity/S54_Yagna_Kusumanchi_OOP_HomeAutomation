package project;

import project.devices.Device;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        Device light = new Light("Bedroom Light", 80);

        light.displayStatus();

        light.turnOn();

        ((Light) light).adjustBrightness(100);

        light.displayStatus();
    }
}