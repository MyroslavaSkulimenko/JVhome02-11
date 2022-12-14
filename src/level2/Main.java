package level2;

import java.util.Arrays;

/*Представьте, что в нашей программе мы обрабатываем массив (например, массив целых чисел или массив сотрудников, если хотите). В production мы запрашиваем ввод массива от пользователя (используем сканер), в тестовой среде мы получаем его как случайный массив или используем массив, определенный в коде. Итак, вам нужно реализовать метод getArray(), который в качестве аргумента принимает способ создания массива и в результате возвращает массив. Реализуйте эту программу (подсказка: используйте знания об интерфейсе)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(new StaticArray())));
        System.out.println(Arrays.toString(getArray(new RandomNumbers())));
        System.out.println(Arrays.toString(getArray(new Production())));

    }
    public static int[] getArray(TreatmentArray array){
        return array.getArray();
    }
}
