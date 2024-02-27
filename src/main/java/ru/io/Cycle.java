package ru.io;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cycle {
    public static void main(String[] args) {
        // Вызов методов с циклами
        whileLoop();
        forLoop();
        doWhileLoop();
        forEachLoop();
    }

    // Метод с циклом while
    public static void whileLoop() {
        int x = 0;
        while (x < 10) {
            //System.out.println("Текущее значение (while): " + x);
            System.out.println("Текущее значение (while): " + x);
            x++;
        }
    }

    // Метод с циклом for
    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Индекс (for): " + i);
        }
    }

    // Метод с циклом do-while
    public static void doWhileLoop() {
        int x = 0;
        do {
            System.out.println("Текущее значение (do-while): " + x);
            x++;
        } while (x < 10);
    }

    // Метод с циклом for-each
    public static void forEachLoop() {
        String[] fruits = {"Яблоко", "Банан", "Апельсин"};
        for (String fruit : fruits) {
            System.out.println("Фрукт (for-each): " + fruit);
        }
    }
}

//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    // Фильтрация четных чисел
//    List<Integer> evenNumbers = numbers.stream()
//            .filter(number -> number % 2 == 0)
//            .collect(Collectors.toList());
//
//    // Отображение четных чисел
//        evenNumbers.forEach(System.out::println);
//
//    List<Integer> sortedNumbers = numbers.stream()
//            .sorted()
//            .collect(Collectors.toList());
//}

