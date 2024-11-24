package project.devices;

public class Fan extends Device {
    private int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (isOn()) {
            this.speed = speed;
            System.out.println(getName() + " speed adjusted to " + speed + ".");
        } else {
            System.out.println(getName() + " is OFF. Cannot adjust speed.");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        if (isOn()) {
            System.out.println("Speed: " + speed);
        }
    }
}
