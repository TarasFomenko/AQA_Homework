import java.util.Arrays;

public class Homework4Task2 {
    public static void main(String[] args) {
        int[] array = {10, 11110, 30, 40, 50, 60, 70, 80, 90, 100};
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 50) {
                number = number + 1;
            }
        }
        int[] array1 = new int[number];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 50) {
                array1[k] = array[i];
                k = k + 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
