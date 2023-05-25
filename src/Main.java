import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }
    public static void task2 () {
        System.out.println("Задача2");
        int[] spending = generateRandomArray();
        int maxSpending = 0;
        int minSpending = 200_000;
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] > maxSpending) {
                maxSpending = spending[i];
            }
            if (spending[i] < minSpending) {
                minSpending = spending[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
    }
    public static void task3 () {
        System.out.println("Задача3");
        int[] spending = generateRandomArray();
        double everageSpending = 0;
        double sum = 0;
        for (int index = 0; index < spending.length; index++) {
            sum += spending[index];
            everageSpending = sum / spending.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + everageSpending + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0  ; i--) {
              System.out.print(reverseFullName[i]);
        }
    }
}