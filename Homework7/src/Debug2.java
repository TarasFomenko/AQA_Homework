public class Debug2 {
    public static void main(String[] args) {
        System.out.println("\nПример кода 2. Сумма всех четных чисел от 1 до 20"); //Код выводит сумму 1
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
Нас выкидывает, потому что условие && срабатывает на второй итерации (2%2 = 0). Нам нужно добавить if внутри цикла и
внутри if ложить i в sum. После выхода из if увеличивать i. В конце вывести сумму
{
        System.out.println("\nПример кода 2. Сумма всех четных чисел от 1 до 20"); //Код выводит сумму 1
        int i = 1;
        int sum = 0;
        while (i <= 20 && i % 2 != 0) {
            sum += i;
            i++;
        }
        System.out.println(sum);
 }
 }*/
