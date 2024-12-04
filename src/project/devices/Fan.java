package project.devices;

public class Fan extends Device {
    private int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public void adjustSpeed(int newSpeed) {
        if (isOn) {
            speed = newSpeed;
        }
    }

    @Override
    public String getDeviceDetails() {
        return "Speed: " + speed;
    }
}
