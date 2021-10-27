import hardware.Battery;
import hardware.Camera;
import hardware.Lens;

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
