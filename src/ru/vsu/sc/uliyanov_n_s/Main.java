package ru.vsu.sc.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findAverageNumb();
    }

    public static void findAverageNumb() {
        int[] nums = new int[3];

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++){
            nums[i] = inNum();
        }

        int firstPairMax = findMaxValue(nums[0], nums[1]);
        int secondPairMax = findMaxValue(nums[1], nums[2]);
        int maxNum = findMaxValue(firstPairMax, secondPairMax);

        int firstPairMin = findMinValue(nums[0], nums[1]);
        int secondPairMin = findMinValue(nums[1], nums[2]);
        int minNum = findMinValue(firstPairMin, secondPairMin);

        int averageNum = (nums[0] + nums[1] + nums[2]) - (minNum + maxNum);

        System.out.print("Average number is " + averageNum);
    }

    public static int findMaxValue(int a, int b) {
        return (a + b)/2 + mod(a - b)/2 ;
    }

    public static int findMinValue(int a, int b) {
        return (a + b)/2 - mod(a - b)/2 ;
    }

    public static int mod(int a) {          //Не использую функцию Math.abs() т.к. там используется условный оператор.
        return (int) Math.sqrt(a * a);
    }

    public static int inNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}