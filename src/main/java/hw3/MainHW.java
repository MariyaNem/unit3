package main.java.hw3;

public class MainHW {

    // HW 3.1. Покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public boolean evenOddNumber(int number) {
        return number % 2 == 0;
    }


    // HW 3.2. Написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public boolean numberInInterval(int number) {
        return number >= 25 && number <= 100;
    }
}