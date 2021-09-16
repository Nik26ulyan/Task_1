package ru.vsu.sc.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printSomething();

        int num1 = readNumForCompare("first");
        int num2 = readNumForCompare("second");
        int num3 = readNumForCompare("third");

        int maxNum = findMaxValue(num1, num2, num3);
        int minNum = findMinValue(num1, num2, num3);

        int averageNum = findAverageNumb(num1, num2, num3, maxNum, minNum);

        printResult(averageNum);
    }

    static void printResult(int a){
        System.out.println("Average number is " + a +".");
    }

    static void printSomething(){
        System.out.println("Enter 3 integer numbers");
    }

    static int findMaxValue(int a, int b, int c) {
        int firstPairMax = ((a + b) + calculateModule(a - b))/ 2;
        int secondPairMax = ((a + c) + calculateModule(a - c)) / 2;
        return ((firstPairMax + secondPairMax) + calculateModule(firstPairMax - secondPairMax)) / 2;
    }

    static int findMinValue(int a, int b, int c) {
        int firstPairMin = ((a + b) - calculateModule(a - b)) / 2;
        int secondPairMin = ((a + c)- calculateModule(a - c)) / 2;
        return ((firstPairMin + secondPairMin) - calculateModule(firstPairMin - secondPairMin)) / 2;
    }

    static int findAverageNumb(int a, int b, int c, int d, int e) {
        return (a + b + c) - (d + e);
    }

    static int calculateModule(int a) {          //Не использую функцию Math.abs() т.к. там есть условный оператор.
        return (int) Math.sqrt(a * a);
    }

    static int readNumForCompare(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the " + text + " number:");

        int a;

        if (scanner.hasNextInt())
            a = scanner.nextInt();
        else {
            System.out.println("Invalid value! Try again.");
            return readNumForCompare(text);
        }

        return a;
    }
}