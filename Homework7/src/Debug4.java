public class Debug3 {
    public static void main(String[] args) {
        System.out.println("\nПример кода 3. Сумма всех четных чисел от 1 до 20"); //Консоль "висит"
        int i = 1;
        int sum = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

/*
После захода в while (2ой раз, если начинаем с числа 1), то у нас if который несрабатывает и i не итеририруется.
Нужно вынести i после if (Одинаково с предыдущим заданием) и поставить == в if.
{
        System.out.println("\nПример кода 3. Сумма всех четных чисел от 1 до 20"); //Консоль "висит"
        int i = 1;
        int sum = 0;
        while (i <= 20) {
            if (i % 2 != 0) {
                sum += i;
                i++;
            }
        }
        System.out.println(sum);
    }
}
 */
