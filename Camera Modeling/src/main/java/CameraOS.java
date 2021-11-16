import hardware.Battery;
import hardware.Camera;
import hardware.Lens;

/**
 * This class is used to drive the CLI. A better name for it may be Controller following the MVC model now that we have
 * learned about those principles.
 */

public class CameraOS {
    Camera camera = new Camera();
    Lens lens = new Lens();
    Battery battery = new Battery();


    public void takePicture() {
        if(camera.isOn() && camera.lensAttached()){
            System.out.println("Click! Picture taken!");
            battery.drainBattery();
        }
    }

}
