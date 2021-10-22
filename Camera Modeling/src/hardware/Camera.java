package hardware;

public class Camera {
    private String manufacturer;
    private String model;
    private String serialNumber;
    private boolean isOn;
    private boolean lensAttached;
    private int batteryLevel;


    public Camera(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        serialNumber = "";
        isOn = false;
        lensAttached = true;
        batteryLevel = 100;
    }

    public Camera() {
        this.manufacturer = "Default";
        this.model = "Default";
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean lensAttached() {
        return lensAttached;
    }

    public void turnOn() {
        if(batteryLevel > 0) {
            isOn = true;
        }
    }

    public void turnOff() {
        isOn = false;
    }

    public void takePicture() {
        if(isOn && lensAttached()){
            System.out.println("Picture taken!");
        }
    }

    public void changeLens() {

    }






}
