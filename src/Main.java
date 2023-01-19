public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.", sum);
    }


    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.", min, max);
    }


    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double time = 30;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double middleExpenses = sum / time;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей.", middleExpenses);
    }


    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - 1; i < reverseFullName.length / 2; i++, j--) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = tmp;
        }
        System.out.println(reverseFullName);
    }
}

