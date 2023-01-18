public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        double[] array = {1.57, 7.654, 9.986};
        int[] arrays = {1, 2, 3, 4, 5};
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[]{1, 2, 3};
        double[] array = {1.57, 7.654, 9.986};
        int[] arrays = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
            if (i < arrays.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[]{1, 2, 3};
        double[] array = {1.57, 7.654, 9.986};
        int[] arrays = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}