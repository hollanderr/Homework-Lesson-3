public class homework_02_06_a {
    /**
     * Created by Serge Prokudin on 11.12.2019.
     * Урок № 2 Задание № 6 Вариант Решения № 2. БЕЗ ВЛОЖЕННЫХ ЦИКЛОВ!!!
     */
    public static void main(String[] args) {
        /**  Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место, в котором сумма левой
         * и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
         * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
         * эти символы в массив не входят.
         */
        int[] checkBalance = {2, 4, 1, 2, 2, 10, 1};
        int sum = 0;
        int halvesum = 0;
        int length = checkBalance.length;
        for (int i = 0; i < length; i++) { // переменная пробегающая индекс всех значений массива
            sum = sum + checkBalance[i]; // считаем ∑ всех значений массива
        }
        for (int i = 0; i < length; i++){ // считаем ∑ значений от первого, прибавляя в цикле следующее значение
            halvesum += checkBalance[i];
            if (halvesum == sum - halvesum){
                System.out.println("true.");
                System.out.println("Сумма эл-тов от 1-го до " + i + " равна ");
                System.out.println("сумме эл-тов от "+ (i+1)+ " до последнего.");
                break;
            }
            if (halvesum > sum - halvesum){
                System.out.println("false: В данном массиве такого места НЕТ.");
                break;
            }
        }
        System.out.println("Сумма всех значений = " + sum);
    }
}

