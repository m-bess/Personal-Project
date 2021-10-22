package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Picture {

    private long pictureId;
    private long userId;
    private int cameraApertureSetting;
    private int cameraShutterSpeedSetting;
    private int cameraIsoSetting;
    private LocalDate dateTaken;
    private LocalDateTime timeTaken;
    private String settingConditions;
    private String pictureDescription;

    public long getPictureId() {
        return pictureId;
    }

    public void setPictureId(long pictureId) {
        this.pictureId = pictureId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getCameraApertureSetting() {
        return cameraApertureSetting;
    }

    public void setCameraApertureSetting(int cameraApertureSetting) {
        this.cameraApertureSetting = cameraApertureSetting;
    }

    public int getCameraShutterSpeedSetting() {
        return cameraShutterSpeedSetting;
    }

    public void setCameraShutterSpeedSetting(int cameraShutterSpeedSetting) {
        this.cameraShutterSpeedSetting = cameraShutterSpeedSetting;
    }

    public int getCameraIsoSetting() {
        return cameraIsoSetting;
    }

    public void setCameraIsoSetting(int cameraIsoSetting) {
        this.cameraIsoSetting = cameraIsoSetting;
    }

    public LocalDate getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(LocalDate dateTaken) {
        this.dateTaken = dateTaken;
    }

    public LocalDateTime getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(LocalDateTime timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getSettingConditions() {
        return settingConditions;
    }

    public void setSettingConditions(String settingConditions) {
        this.settingConditions = settingConditions;
    }

    public String getPictureDescription() {
        return pictureDescription;
    }

    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription;
    }
}
