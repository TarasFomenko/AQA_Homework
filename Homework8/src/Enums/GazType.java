package Enums;

public enum GazType {

    Diesel ("Дизель"),
    Gazoline ("Бензин");

    private String gazType;

    GazType(String gazType) {
        this.gazType = gazType;
    }

    public String getGazType() {
        return gazType;
    }
}

