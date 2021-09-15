package ru.vsu.sc.uliyanov_n_s;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printSomething("Enter 3 integer numbers:");

        int num1 = readNumForComparison("first");
        int num2 = readNumForComparison("second");
        int num3 = readNumForComparison("third");

        int firstPairMax = findMaxValueInPair(num1, num2);
        int secondPairMax = findMaxValueInPair(num2, num3);
        int maxNum = findMaxValueInPair(firstPairMax, secondPairMax);

        int firstPairMin = findMinValueInPair(num1, num2);
        int secondPairMin = findMinValueInPair(num2, num3);
        int minNum = findMinValueInPair(firstPairMin, secondPairMin);

        int averageNum = findAverageNumb(num1, num2, num3, minNum, maxNum);

        printResult(averageNum);
    }

    static int findAverageNumb(int a, int b, int c, int d, int e) {
        return a + b + c - (d + e);
    }

    static int findMaxValueInPair(int a, int b) {
        return (a + b) / 2 + CalcModuleMethod(a - b) / 2;
    }

    static int findMinValueInPair(int a, int b) {
        return (a + b) / 2 - CalcModuleMethod(a - b) / 2;
    }

    static int CalcModuleMethod(int a) {          //Не использую функцию Math.abs() т.к. там есть условный оператор.
        return (int) Math.sqrt(a * a);
    }

    static void printSomething(String text){
        System.out.println();
    }

    static void printResult(int a) {
        System.out.print("Average number is " + a);
    }

    static int readNumForComparison(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the " + text + " number");
        return scanner.nextInt();
    }

    static int readNum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number");
        return scanner.nextInt();
    }

    static int readNum3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter third number");
        return scanner.nextInt();
    }
}