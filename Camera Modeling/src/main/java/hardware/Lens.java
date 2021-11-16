package hardware;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * This class instantiates a lens. Each lens has different aperture specifications similar to real-world lenses
 * 
 */

public class Lens {
    private String manufacturer;
    private boolean primeLens;
    private boolean zoomLens;
    private int minZoom;
    private int maxZoom;
    private boolean lensCapOn;
    private boolean isAttached;

    public List<BigDecimal> apertureSettings = new ArrayList<>();


    public Lens(String manufacturer, int minZoom, int maxZoom, boolean primeLens, boolean zoomLens){
        this.manufacturer = manufacturer;
        this.minZoom = minZoom;
        this.maxZoom = maxZoom;
        if(primeLens){
            zoomLens = false;
        }
        if(zoomLens){
            primeLens = false;
        }
        lensCapOn = true;
        isAttached = false;
    }

    public Lens(){
        this.manufacturer = "Default";
        this.lensCapOn = true;
        this.isAttached = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isPrimeLens() {
        return primeLens;
    }

    public boolean isZoomLens() {
        return zoomLens;
    }

    public int getMinZoom() {
        return minZoom;
    }

    public int getMaxZoom() {
        return maxZoom;
    }

    public boolean isLensCapOn() {
        return lensCapOn;
    }

    public boolean isAttached() {
        return isAttached;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMinZoom(int minZoom) {
        this.minZoom = minZoom;
    }

    public void setMaxZoom(int maxZoom) {
        this.maxZoom = maxZoom;
    }

    //Need a list of Aperture settings with List





}
