package ru.io;

public class Dimensions {
    public static void main(String[] args) {

        boolean isEve00 = isEven(6);
        System.out.println(isEve00);
        int i = calculateSum(5, 6);
        System.out.println(i);

        System.out.println(sum(4, 5));

        int[] numbers = {10, 20, 30, 40, 50};
        // Добавьте выражение numbers[2] в "Watches" для отслеживания значения элемента с индексом 2
        printNumbers(numbers);

    }
    public static void printNumbers(int[] numbers) {
        for (int index = 0; index <= 4; index++) {
            int number = numbers[index];
            System.out.println(number);
            // Давайте укажем индекс элемента в массиве numbers равное 5
        }
    }
    public static int calculateSum(int a, int b){
        int sum = a + b; // Установите точку останова на этой строке
        return sum;
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

