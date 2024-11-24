package project.devices;

public class Fan extends Device {
    private int speed;

    public Fan(String name, int speed) {
        super(name); // Calling the parent class constructor
        this.speed = speed;
    }

    public void adjustSpeed(int newSpeed) {
        if (isOn) {
            speed = newSpeed;
            System.out.println(name + " speed adjusted to " + speed + ".");
        } else {
            System.out.println(name + " is OFF. Cannot adjust speed.");
        }
    }

    // Implementing the abstract method
    @Override
    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Speed: " + speed);
        }
    }
}
