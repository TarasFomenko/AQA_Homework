import java.util.Arrays;

public class AnimalExample {
    public static void main(String[] args) {

        Animal animal = new Dog("Собака", "Тор", 5, 45);
        Animal animal2 = new Dog("Собака", "Локи", 15, 49);
        Animal animal3 = new Dog("Собака", "Один", 4, 42);
        Animal animal4 = new Dog("Собака", "Хэймдалл", 7, 51);
        Animal animal5 = new Cat("Кот", "Геракл", 8, 7, 2.1);
        Animal animal6 = new Cat("Кот", "Одиссей", 9, 6, 1.5);
        Animal animal7 = new Cat("Кот", "Тесей", 12, 9, 0.9);
        Animal animal8 = new Bird("Птица", "Икар", 2, 4, 2.7);
        Animal animal9 = new Bird("Птица", "Дедал", 10, 5, 0.8);
        Animal animal10 = new Bird("Птица", "Райт", 3, 3, 2.0);

        Animal[] animalArray = {animal, animal2, animal3, animal4, animal5, animal6, animal7, animal8, animal9, animal10};

        getOldAnimalsVoice(animalArray);
        System.out.println();

        Bird[] justBirds = getBirdArray(animalArray);
        getBirdsInfo(justBirds);

        Cat hercules = (Cat) animal6;

        int amountOfCatch = calculateAmountOfCaughtBirds(justBirds, hercules);;
        printLiveBirdsArray(justBirds, hercules, amountOfCatch);
    }

       public static Bird[] getBirdArray(Animal[] animals) {
        int amountOfBirds = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals("Птица")) {
                amountOfBirds = amountOfBirds + 1;
            }
        }
        Bird[] justBirds = new Bird[amountOfBirds];
        int increaseArrayPlace = 0;
        for (int j = 0; j < animals.length; j++) {
            if (animals[j].name.equals("Птица")) {
                justBirds[increaseArrayPlace] = (Bird) animals[j];
                increaseArrayPlace = increaseArrayPlace + 1;
            }
        }
        return justBirds;
    }

    public static void getOldAnimalsVoice(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].age >= 10) {
                animals[i].raiseVoice();
            }
        }
    }

    public static void getBirdsInfo(Bird[] birds) {
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].toString());
            birds[i].toFlight();
            System.out.println();
        }
    }

    public static int calculateAmountOfCaughtBirds (Bird[] birds, Cat cat){
        int amountOfCatch = 0;
        for (int i = 0; i < birds.length; i++) {
            if (cat.catchTheBird(birds[i])) {
                amountOfCatch = amountOfCatch + 1;
            }
        }
        return amountOfCatch;
    }

    public static void printLiveBirdsArray (Bird[] birds, Cat cat, int amountOfCatch){
        int counter = 0;
        Bird[] wasntCatched = new Bird[birds.length - amountOfCatch];
        for (int i = 0; i < birds.length; i++) {
            if (cat.jumpHeight <= birds[i].flightHeight) {
                wasntCatched[counter] = birds[i];
                counter++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(wasntCatched));
    }
}





