package com.itechart.lesson2;
/*2. Также реализуйте алгоритм сортировки пузырьком(посмотрите алгоритм в интернете)
для полученного массива и распечатайте отсортированный массив в консоль
в одну строку через пробел.*/
public class Task2 {
    public static void main(String[] args) {
        int s = 10;
        double [] list = new double[s];
        for (int i = 0; i < s; ++i) {
            list[i] = Math.random();
        }
        for (int i = 0; i < s; ++i) {
            for (int j = 0; j < s - 1; j++) {
                if (list[j] > list[j + 1]) {
                    double t = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < s; ++i) {
            System.out.print(list[i] + " ");
        }
    }
}
