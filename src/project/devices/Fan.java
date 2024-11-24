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

    // Overriding the displayStatus method (runtime polymorphism)
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the parent method
        if (isOn) {
            System.out.println("Speed: " + speed);
        }
    }
}
