public class CarArray {
    private Car[] carArray = new Car[0];

    public CarArray() {
    }

    public void addCar(Car car) {
        Car[] cars = new Car[carArray.length + 1];
        for (int i = 0; i < carArray.length; i++) {
            cars[i] = carArray[i];
        }
        cars[cars.length - 1] = car;
        carArray = cars;
    }

    public void printArrayCarInfo() {
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].printInfo();
        }
    }

    public Car[] sortCars() {
        Car k;
        for (int j = 0; j < carArray.length - 1; j++) {
            for (int i = 0; i < carArray.length - 1 - j; i++) {
                if (carArray[i].yearOfProduction > carArray[i + 1].yearOfProduction) {
                    k = carArray[i];
                    carArray[i] = carArray[i + 1];
                    carArray[i + 1] = k;
                }
            }
        }
        return carArray;
    }

    public Car[] redCars() {
        int howMuchRedCars = 0;
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].color.equals("Red")) {
                howMuchRedCars = howMuchRedCars + 1;
            }
        }

        Car[] allRedCars = new Car[howMuchRedCars];
        int increaseArrayPlace = 0;
        for (int j = 0; j < carArray.length; j++) {
            if (carArray[j].color.equals("Red")) {
                allRedCars[increaseArrayPlace] = carArray[j];
                increaseArrayPlace = increaseArrayPlace + 1;
            }
        }
        return allRedCars;
    }
}
