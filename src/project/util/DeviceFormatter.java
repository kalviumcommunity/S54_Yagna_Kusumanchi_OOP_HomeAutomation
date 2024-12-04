package project.util;

import project.devices.Device;

public class DeviceFormatter {
    // Utility method to format device status for display
    public static String formatDeviceStatus(Device device) {
        String status = device.isOn() ? "ON" : "OFF";
        return device.getName() + " is " + status + ". " + device.getDeviceDetails();
    }
}
