package project.devices;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private List<Device> Devices;

    public DeviceManager() {
        Devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        Devices.add(device);
    }

    public void turnAllDevicesOn() {
        for (Device device : Devices) {
            device.turnOn();
        }
    }

    public void displayAllDeviceDetails() {
        for (Device device : Devices) {
            System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF") + ". " + device.getDeviceDetails());
        }
    }

    public void turnAllDevicesOff() {
        for (Device device : Devices) {
            device.turnOff();
        }
    }
}
