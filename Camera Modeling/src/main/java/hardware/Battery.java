package hardware;

/**
 * This class instantiates a battery, necessary for a camera to function.
 * Battery drain is a constant that is based on real-world Canon battery function
 */

public class Battery {

    //Does this class make sense or should I just move it into the camera class?

    private static final int BATTERY_USED_TO_TAKE_PICTURE = 1;
    private static final int LOW_BATTERY = 50;


    private int batteryLevel = 1000;
    private int lowBattery = LOW_BATTERY;
    private int deadBattery = 0;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isBatteryLow() {
        if(batteryLevel == lowBattery) {
            return true;
        } return false;
    }

    public void batteryDead(){
        if(batteryLevel == deadBattery) {
            System.out.println("Battery is dead. You should have listened!");
        }
    }

    public int drainBattery() {
        batteryLevel -= BATTERY_USED_TO_TAKE_PICTURE;
        return batteryLevel;
    }
}
