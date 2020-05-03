public class Car {
    public String model;
    public String color;
    public double engineCapacity;
    public int yearOfProduction;
    public int carAge = 0;

    public Car(String model, String color, double engineCapacity, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
        this.carAge = 2020 - yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void own() {
        System.out.println("I'm owning " + model + " " + yearOfProduction);
    }


    public void currentCarAge() {
        if (yearOfProduction < 2021) {
            System.out.println(model + " " + "age = " + carAge);
        }
    }

    public void printInfo() {
        System.out.println(("Car is: " + this.model + " " + this.yearOfProduction + " " + this.color + " " + this.engineCapacity));
    }
}


