package lv.acodemy.classroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        // Array
        int[] numbers = {1, 5, 9, 10, 20, 30, 50};
        System.out.println(numbers[3]);

        //numbers[0] = 1
        //numbers[1] = 5
        //numbers[2] = 9
        //numbers[3] = 10
        //System.out.println(numbers[7]); = out of bounds

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        //String array
        String[] names = {"John", "Andrew", "Mary", "Angelina"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[2]);

        //Logical statements

        /*

        if(contition) = boolean [true/false]

         */

        if (5 < 10) {
            System.out.println("Yes, this is correct");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("I'm in Miami BITCH");
        }


        int a = 44;

        if (a > 0) {
            System.out.println("The number is positive: " + a);
        }

        if (a < 0) {
            System.out.println("The number is negative: " + a);
        }

        if (a % 2 == 0) {
            System.out.println("This number can be divided by 2");
        }


        if (a > 0) {
            System.out.println("The number is positive: " + a);
        } else if (a < 0) {
            System.out.println("The number is negative: " + a);
        }

        int b = 15;
        if (b > 18) {
            System.out.println("U can vote... Muchacha");
        } else if (b < 18) {
            System.out.println("U cannot vote... Bitch");
        }

        int c = 5;
        if (c % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        boolean isAutumn = false;
        boolean isWinter = false;

        if (isSummer) {
            System.out.println("Beach party and First nightclub");
        } else if (isAutumn) {
            System.out.println("Turn off this shitty weather");
        } else if (isWinter) {
            System.out.println("Oh, its christmas time!");
        } else {
            System.out.println("WTF is going on? March?");
        }

        int grade = 7;
        if (grade == 2) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Alsmost satofactory");
        } else if (grade == 5) {
            System.out.println("Satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good");
        } else if (grade == 7) {
            System.out.println("Good");
        } else if (grade == 8) {
            System.out.println("Very good");
        } else if (grade == 9) {
            System.out.println("Excellent");
        } else if (grade == 10) {
            System.out.println("Perfect");
        } else {
            System.out.println("Incorrect grade");
        }

        int angle = 125;
        if (angle > 0 & angle < 90) {
            System.out.println("Accute angle");
        } else if (angle == 90) {
            System.out.println("Right angle");
        } else if (angle > 90 & angle < 180) {
            System.out.println("Obtuse");
        } else if (angle == 180) {
            System.out.println("Straight");
        }

        int[] numberArray = {4, 10, 5};
        int maxNum = 10;
        if (numberArray[0] < numberArray[1]){
            maxNum = numberArray[1];
        } else if (numberArray[1] < numberArray[2]) {
            maxNum = numberArray[2];
        } else if (numberArray[2] < numberArray[3]) {
            maxNum = numberArray[3];
        } else {
            System.out.println("n/a");
        }
        System.out.println("Max num: " + maxNum);
    }
}

