package ru.geekbrains.HomeWork_2;

public class Main {

    public static void main(String[] args) {
//        summTwoNumber(10,5);
//        number(-15);
//        someNumber(20);
//        severalWord("Хай!!", 5);
//        hightYear(2021);


    }


//      1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
// пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean summTwoNumber(int a, int b) {
        int summ = a + b;
        if (summ <= 20 && summ >= 10) {
            return true;
        } else {
            return false;
        }

    }

//    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static int number(int a) {
        if (a >= 0) {
            System.out.println("Число является положительным!");
            return a;
        }
        System.out.println("Число является отрицательным!");
        return a;

    }

//    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//    если число отрицательное, и вернуть false если положительное.


    public static boolean someNumber(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }

//    4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void severalWord(String word, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

//    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
//    при этом каждый 400-й – високосный.


    public static boolean hightYear(int a) {
        if (((a % 4 == 0) && (a % 100 != 0)) & (a % 400 != 0)) {
            return true;
        }
        else {
            return false;
        }

    }
}




