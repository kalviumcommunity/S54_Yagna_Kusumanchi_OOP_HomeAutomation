package project.devices;

public class Fan extends Device {
    private int speed;

    // Parameterized constructor
    public Fan(String name, int speed) {
        super(name);  // Call to the parent class constructor
        this.speed = speed;
    }

    // Adjust speed
    public void adjustSpeed(int newSpeed) {
        if (isOn) {
            speed = newSpeed;
            System.out.println(name + " speed adjusted to " + speed + ".");
        } else {
            System.out.println(name + " is OFF. Cannot adjust speed.");
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        if (isOn) {
            System.out.println("Speed: " + speed);
        }
    }
}
