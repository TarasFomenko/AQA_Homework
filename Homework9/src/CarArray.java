import java.util.ArrayList;
import java.util.HashMap;

public class CarArray {
    private ArrayList<Car> carArray = new ArrayList<>();

    public void add (Car car) {
        carArray.add(car);
    }

    public ArrayList<Car> getCarArray() {
        return carArray;
    }


    public static void printCars(ArrayList<Car> cars) {
        String s = "\nCarArray: ";
        for (int i = 0; i < cars.size(); i++) {
            s += "\n" + i +
                    ": model='" + cars.get(i).model + '\'' +
                    ", color='" + cars.get(i).color + '\'' +
                    ", engineType=" + cars.get(i).engineType +
                    ", yearOfProduction=" + cars.get(i).yearOfProduction;
        }
        System.out.println(s);
    }

    public ArrayList<Car> sortCars() {
        ArrayList<Car> sortedCars = carArray;
        sortedCars.sort(new YearComparator());
        return sortedCars;
    }

    public ArrayList<Car> getCarsByColor(String color) {
        ArrayList<Car> allRedCars = new ArrayList<>();
        for (Car car : carArray) {
            if (car.color.equals(color)) {
                allRedCars.add(car);
            }
        }
        return allRedCars;
    }

    public HashMap<String, Integer> getColorStatistic() {
        HashMap<String, Integer> statisticMap = new HashMap<>();
        for (int i = 0; i < carArray.size(); i++) {

            if (!statisticMap.containsKey(carArray.get(i).getColor())) {
                int colorCount = 0;
                for (int j = 0; j < carArray.size(); j++) {
                    if (carArray.get(i).getColor().equals(carArray.get(j).getColor())) {
                        colorCount++;
                    }
                }
                statisticMap.put(carArray.get(i).getColor(), colorCount);
            }
        }
        return statisticMap;
    }

    public HashMap<String, Integer> getColorStatisticNew() {
        HashMap<String, Integer> statisticMap = new HashMap<>();
        for (Car car: carArray) {
            if (!statisticMap.containsKey(car.getColor())) {
                statisticMap.put(car.getColor(), 1);
            } else {
                statisticMap.put(car.getColor(), statisticMap.get(car.getColor()) + 1);
            }
        }
        return statisticMap;
    }

}
