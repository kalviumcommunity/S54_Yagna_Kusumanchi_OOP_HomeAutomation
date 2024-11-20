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
