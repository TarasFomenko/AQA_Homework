package EngineTypes;

import Enums.GazType;
import Interfaces.IEngine;

public class GazEngine implements IEngine {

    private double engineCapacity;
    private GazType gazType;

    public GazEngine(double engineCapacity, GazType petrolType) {
        this.engineCapacity = engineCapacity;
        this.gazType = petrolType;
    }

    @Override
    public String toString() {
        return "Gaz Engine {" + "engineCapacity = " + engineCapacity + ", petrolType = " + gazType + '}';
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public GazType getGazType() {
        return gazType;
    }

    @Override
    public void move() {
        System.out.println("Internal combustion engine is driving!");
    }
}
