package project.devices;

public class SecurityCamera extends Device {
    private boolean isRecording;

    public SecurityCamera(String name) {
        super(name);
        this.isRecording = false;
    }

    public void startRecording() {
        if (isOn) {
            isRecording = true;
        }
    }

    public void stopRecording() {
        if (isOn) {
            isRecording = false;
        }
    }

    @Override
    public String getDeviceDetails() {
        return "Recording: " + (isRecording ? "Yes" : "No");
    }
}
