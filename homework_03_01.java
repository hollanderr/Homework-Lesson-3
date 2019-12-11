package ru.prokudin.geekbrains.homework;

import java.util.Scanner;

/**
* Created by Serge Prokudin on 11.12.2019.
* Урок № 3 Задание № 1.
* Написать программу, которая загадывает случайное число от 0 до 9,
* и пользователю дается 3 попытки угадать это число.
* При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
* чем загаданное, или меньше.
* После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
* (1 – повторить, 0 – нет).
*/

public class homework_03_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача - Угадать число");
        int range = 9; // Угадываем число в промежутке от 0 до range
        int count_max = 3; // Максимальное кол-во попыток угадывания
        int count = 1;
        int answer = 1;
        while (answer == 1) { // Внешний цикл - чтобы можно было сыграть ещё одну новую игру
            System.out.println("Угадайте число от 0 до " + range);
            System.out.println("Количество попыток для угадывания: " + count_max);

            int number = (int) (Math.random() * range); // Ввод системой рандомного числа для угадывания
            while (count <= count_max) {
                int rest_try = count_max - count; // Счётчик оставшихся попыток
                System.out.println("Попытка номер: " + count + "(Ещё осталось попыток: " + rest_try + ")");
                System.out.println("Введите число и нажмите <Enter>: ");
                int input_number = scanner.nextInt(); // Ввод угадываемого числа
                if (input_number == number) {
                    System.out.println("Вы угадали c " + count + " попыток");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число - больше");
                }
                ++count;
                if (count > count_max) {
                    System.out.println("Упс! Вы неугадали! :(");
                }
            }
            count = 1; // Обнуление счётчика кол-ва попыток
            System.out.println("Повторить игру ещё раз? 1 - Да / 0 - Нет");
            answer = scanner.nextInt();
        }
        scanner.close();
    }
}
