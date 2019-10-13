package com.itechart.lesson2;
/*1. Заполните массив случайным числами и выведете максимальное,
 минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(),
 который возвращает значение в промежутке [0, 1].
 */
public class Task1 {
    public static void main(String[] args) {
        int  s= 5;
        double[] list = new double[s];
        for (int i = 0; i < s; ++i) {
            list[i] = Math.random(); //рандомное значение
        }
        double max = list[0];
        double min = list[0];
        double avg = 0;
        for (int i = 0; i < s; ++i) {
            if (max < list[i]) {
                max = list[i];
            }
            if (min > list[i]) {
                min = list[i];
            }
            avg += list[i] / s;
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальное элемент: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}