package project.devices;

public class SmartThermostat extends Device {
    private int temperature;

    public SmartThermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(int newTemperature) {
        if (isOn) {
            temperature = newTemperature;
        }
    }

    @Override
    public String getDeviceDetails() {
        return "Temperature: " + temperature + "°C";
    }
}
