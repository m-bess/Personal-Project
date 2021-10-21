import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Camera myMainCamera = new Camera("Canon", "60D");
        System.out.println(myMainCamera.getManufacturer() + " " + myMainCamera.getModel());

        Lens zoom17To50 = new Lens("Sigma", 17, 50, false, true);

        Camera userCamera = new Camera();
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is you camera manufacturer?");
        userCamera.setManufacturer(userInput.nextLine());
        if(userCamera.getManufacturer().equalsIgnoreCase("Canon")){
            System.out.println("You entered " + userCamera.getManufacturer() + ". Great choice!");
        } else if(userCamera.getManufacturer().equalsIgnoreCase("Nikon")){
            System.out.println("You entered " + userCamera.getManufacturer() + ". You chose poorly...");
        }
    }
}
