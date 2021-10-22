package Picture;

import java.util.List;

public class CameraSettings {

    //Aperture is technically part of a lens. Should it go here though?
    //Probably because on modern cameras you control the aperture through the camera...not directly on the lens
    //Or does it exist on both since the aperture settings vary from lens to lens

    private List<Integer> isoSetting;
    private List<Integer> apertureSetting;
    private List<Integer> shutterSpeed; //technically in the real world these are fractions of a second...how should I model it for the application? BigDecimal?



}
