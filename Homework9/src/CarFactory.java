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
        Car auto6 = new Car("Nissan", "Black", electricEngine, 2012);
        Car auto7 = new Car("Lexus", "White", dieselEngine, 2012);

        CarArray carArray = new CarArray();
        carArray.add(auto1);
        carArray.add(auto2);
        carArray.add(auto3);
        carArray.add(auto4);
        carArray.add(auto5);
        carArray.add(auto6);
        carArray.add(auto7);

        CarArray.printCars(carArray.getCarArray());
        CarArray.printCars(carArray.sortCars());
        CarArray.printCars(carArray.getCarsByColor("Red"));
        CarArray.printCars(carArray.getCarsByColor("Black"));
        System.out.println("\n" + carArray.getColorStatistic());
    }
}


