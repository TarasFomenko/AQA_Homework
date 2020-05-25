import Interfaces.IEngine;

public class Car {
    public String model;
    public String color;
    public IEngine engineType;
    public int yearOfProduction;

    public Car(String model, String color, IEngine engineType, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.engineType = engineType;
        this.yearOfProduction = yearOfProduction;
    }

    public void move() {
        engineType.move();
    }

    @Override
    public String toString() {
        System.out.println(engineType.toString() + " , from " + model);
        return null;
    }

    public String getColor() {
        return color;
    }
}

