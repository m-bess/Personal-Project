import hardware.Camera;
import hardware.Lens;

import java.util.Scanner;

public class PictureAppCLI {

    //Should I follow the VendingMachineCLI pattern and declare methods in a PictureApp class? Or put everything directly in the CLI like the recent exercises?
    //I'm leaning toward creating a dedicated class...

    private static final String MENU_OPTION_EXIT = "Exit";
    private static final String LOGIN_MENU_OPTION_REGISTER = "Register";
    private static final String LOGIN_MENU_OPTION_LOGIN = "Login";
    private static final String[] LOGIN_MENU_OPTIONS = { LOGIN_MENU_OPTION_REGISTER, LOGIN_MENU_OPTION_LOGIN, MENU_OPTION_EXIT};

    private static final String MAIN_MENU_OPTION_VIEW_EQUIPMENT = "View equipment";
    private static final String MAIN_MENU_OPTION_ADD_NEW_CAMERA = "Add camera to equipment";
    private static final String MAIN_MENU_OPTION_ADD_NEW_LENS = "Add lens to equipment";
    private static final String MAIN_MENU_OPTION_ADD_NEW_PHOTO = "Add photo to library";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_VIEW_EQUIPMENT, MAIN_MENU_OPTION_ADD_NEW_CAMERA, MAIN_MENU_OPTION_ADD_NEW_LENS, MAIN_MENU_OPTION_ADD_NEW_PHOTO, MENU_OPTION_EXIT};


    public static void main(String[] args) {
        CameraOS cameraOS = new CameraOS();
        cameraOS.run();

    }


}
