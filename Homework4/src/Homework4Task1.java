import java.util.Arrays;

public class Homework4Task1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[array1.length - i - 1] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }
}


