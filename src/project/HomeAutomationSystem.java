package project;

import project.devices.AbstractDevice;
import project.devices.Fan;
import project.devices.Light;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        AbstractDevice livingRoomLight = new Light("Living Room Light", 70);
        AbstractDevice bedroomFan = new Fan("Bedroom Fan", 3);

        // Demonstrating abstraction
        livingRoomLight.turnOn();
        ((Light) livingRoomLight).adjustBrightness(90);
        livingRoomLight.displayStatus();

        System.out.println();

        bedroomFan.turnOn();
        ((Fan) bedroomFan).adjustSpeed(5);
        bedroomFan.displayStatus();

        System.out.println();

        livingRoomLight.turnOff();
        bedroomFan.turnOff();
    }
}
