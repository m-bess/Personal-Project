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

    public void run() {
        printGreeting();

    }

    private void printGreeting() {
        System.out.println("");
        System.out.println("*********************************************");
        System.out.println("Welcome to the Camera Simulation Application!");
        System.out.println("*********************************************");
        System.out.println("");
    }

//    Scanner userInput = new Scanner(System.in); //Prompting user to input information about their equipment. Goal is to create a database that holds this info
//        System.out.println("What is you camera manufacturer?");
//    //Utilizing information input by the User to set Camera manufacturer
//        userCamera.setManufacturer(userInput.nextLine());
//        if(userCamera.getManufacturer().equalsIgnoreCase("Canon")){
//        System.out.println("You entered " + userCamera.getManufacturer() + ". Great choice!");
//    } else if(userCamera.getManufacturer().equalsIgnoreCase("Nikon")){
//        System.out.println("You entered " + userCamera.getManufacturer() + ". You chose poorly..."); //Might not make me popular with the Nikon users...
//    }

}
