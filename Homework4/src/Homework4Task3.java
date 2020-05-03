import java.util.Arrays;

public class Homework4Task3 {
    public static void main(String[] args) {
        int[] array = {34, 3, 6, 3, 42, 54, 32, 3333, 3214215, 5125145, 55, 552};
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}