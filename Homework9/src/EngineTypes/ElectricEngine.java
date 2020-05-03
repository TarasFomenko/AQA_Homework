package EngineTypes;

import Interfaces.IEngine;

public class ElectricEngine implements IEngine {
    private String engineCapacity;

    public ElectricEngine(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Electric Engine ({" + "engineCapacity = " + engineCapacity + "}" + ")";
    }

    @Override
    public void move() {
        System.out.println("ElectroCar is driving!");
    }
}
