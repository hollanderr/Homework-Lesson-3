package ru.prokudin.geekbrains.lesson2;
/**
 * Created by Serge Prokudin on 11.12.2019.
 * Урок № 2 Задание № 6 Вариант Решения № 2. С вложенными циклами.
 */
public class homework_02_06_b {

    public static void main(String[] args) {
        int[] massiv = {2, 4, 1, 2, 2, 10, 1};
        int sumleft;
        int sumright;
        int length = massiv.length;
        for (int i = 0; i < length-1; i++) { // переменная пробегающая индекс всех значений массива
            sumleft = 0;
            sumright = 0;
            for (int j = 0;j <= i; j++) { // индекс знач-й от 0 до текущего(в данном цикле) знач-я i(включ)
                sumleft = sumleft + massiv[j]; // сумма значений слева от условного делителя
            }
            for (int k = i + 1; k < length; k++){ // индекс от текущего i до конца массива
                sumright = sumright + massiv[k]; //сумма значений справа от условного делителя
            }
            System.out.println(sumleft + " vs " + sumright); //Сравниваем правую и левую суммы для наглядности
            if (sumleft == sumright){ // если суммы равны, выводим 'true' и прекращаем итерации
                System.out.println("true");
                break;
            }
        }
    }
}
