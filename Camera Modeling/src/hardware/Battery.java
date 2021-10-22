package hardware;

public class Battery {

    private static final int BATTERY_USED_TO_TAKE_PICTURE = 1;
    private static final int LOW_BATTERY = 10;


    private int batteryLevel = 100;
    private int lowBattery = LOW_BATTERY;
    private int deadBattery = 0;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isBatteryLow() {
        if(batteryLevel == lowBattery) {
            System.out.println("Battery level is low. You should charge it!");
        } return true;
    }

    public void batteryDead(){
        if(batteryLevel == deadBattery) {
            System.out.println("Battery is dead. You should have listened!");
        }
    }


}
