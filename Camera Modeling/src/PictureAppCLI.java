import hardware.Camera;
import hardware.Lens;

import java.util.Scanner;

public class PictureAppCLI {

    //Should I follow the VendingMachineCLI pattern and declare methods in a PictureApp class? Or put everything directly in the CLI like the recent exercises?
    //I'm leaning toward creating a PictureApp class

    public static void main(String[] args) {


        Camera myMainCamera = new Camera("Canon", "60D"); //Testing that camera constructor works
        System.out.println(myMainCamera.getManufacturer() + " " + myMainCamera.getModel());

        Lens zoom17To50 = new Lens("Sigma", 17, 50, false, true); //Testing that lens constructor works

        Camera userCamera = new Camera();

        Scanner userInput = new Scanner(System.in); //Prompting user to input information about their equipment. Goal is to create a database that holds this info
        System.out.println("What is you camera manufacturer?");
        //Utilizing information input by the User to set Camera manufacturer
        userCamera.setManufacturer(userInput.nextLine());
        if(userCamera.getManufacturer().equalsIgnoreCase("Canon")){
            System.out.println("You entered " + userCamera.getManufacturer() + ". Great choice!");
        } else if(userCamera.getManufacturer().equalsIgnoreCase("Nikon")){
            System.out.println("You entered " + userCamera.getManufacturer() + ". You chose poorly..."); //Might not make me popular with the Nikon users...
        }
    }

    public void run() {
        printGreeting();

    }

    private void printGreeting() {
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("Welcome to the Picture Simulation Application!");
        System.out.println("**********************************************");
        System.out.println("");
    }
}
