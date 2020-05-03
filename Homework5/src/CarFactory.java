public class CarFactory {
    public static void main(String[] args) {
        Car auto1 = new Car("VW", "Red", 2.0, 2019);
        Car auto2 = new Car("Audi", "Red", 2.4, 2014);
        Car auto3 = new Car("Mercedes", "Red", 3.0, 2012);
        Car auto4 = new Car("Volvo", "Black", 5.0, 2017);
        Car auto5 = new Car("BMW", "White", 7.0, 2015);
        Car[] allAutomobiles = {auto1, auto2, auto3, auto4, auto5};
        CarFactory.printAllCarInfo(allAutomobiles);
        System.out.println();
        for (int i = 0; i < allAutomobiles.length; i++) {
            allAutomobiles[i].own();
        }
        System.out.println();
        for (int i = 0; i < allAutomobiles.length; i++) {
            allAutomobiles[i].currentCarAge();
        }
        System.out.println();
        for (int j = 0; j < allAutomobiles.length - 1; j++) {
            for (int i = 0; i < allAutomobiles.length - 1 - j; i++) {
                if (allAutomobiles[i].yearOfProduction > allAutomobiles[i + 1].yearOfProduction) {
                    Car k = allAutomobiles[i];
                    allAutomobiles[i] = allAutomobiles[i + 1];
                    allAutomobiles[i + 1] = k;
                }
            }
        }
        CarFactory.printAllCarInfo(allAutomobiles);
        System.out.println();
        int howMuchRedCars = 0;
        for (int i = 0; i < allAutomobiles.length; i++) {
            if (allAutomobiles[i].color.equals("Red")) {
                howMuchRedCars = howMuchRedCars + 1;
            }
        }

        Car[] allRedCars = new Car[howMuchRedCars];
        int increaseArrayPlace = 0;
        for (int j = 0; j < allAutomobiles.length; j++) {
            if (allAutomobiles[j].color.equals("Red")){
                allRedCars[increaseArrayPlace] = allAutomobiles[j];
                increaseArrayPlace = increaseArrayPlace +1;
            }
        }
        CarFactory.printAllCarInfo(allRedCars);
        System.out.println();

        CarArray cars = new CarArray();
        cars.addCar(auto1);
        cars.printArrayCarInfo();
        System.out.println();
        cars.addCar(auto2);
        cars.printArrayCarInfo();
        System.out.println();
        cars.addCar(auto3);
        cars.printArrayCarInfo();
        System.out.println();
        cars.addCar(auto4);
        cars.printArrayCarInfo();
        System.out.println();
        cars.addCar(auto5);
        cars.printArrayCarInfo();
        System.out.println();

        Car[] newCars = cars.sortCars();
        CarFactory.printAllCarInfo(newCars);
        System.out.println();

        Car[] newRedCars = cars.redCars();
        CarFactory.printAllCarInfo(newRedCars);


    }
    private static void printAllCarInfo(Car[] array){
        for (int i = 0; i < array.length; i++) {
            array[i].printInfo();
        }
    }
}


