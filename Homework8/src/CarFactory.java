import EngineTypes.ElectricEngine;
import EngineTypes.GazEngine;
import Enums.GazType;


public class CarFactory {
    public static void main(String[] args) {

        GazEngine gazEngine = new GazEngine(3.5, GazType.Gazoline);
        GazEngine dieselEngine = new GazEngine(2.0, GazType.Diesel);
        ElectricEngine electricEngine = new ElectricEngine("90Kw");

        Car auto1 = new Car("VW", "Red", gazEngine, 2019);
        Car auto2 = new Car("Audi", "Red", dieselEngine, 2014);
        Car auto3 = new Car("Mercedes", "Red", gazEngine, 2012);
        Car auto4 = new Car("Volvo", "Black", electricEngine, 2017);
        Car auto5 = new Car("BMW", "White", electricEngine, 2015);

        Car[] allAutomobiles = {auto1, auto2, auto3, auto4, auto5};

        for (Car car: allAutomobiles) {
            car.move();
        }

        System.out.println();

        for (Car car: allAutomobiles) {
            car.toString();
        }
    }
}


