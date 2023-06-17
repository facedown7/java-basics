package lv.acodemy.homework;

import java.util.Scanner;

public class IfElseHomework {
    //Task: If Statement
    //Write a program that checks if a given number is positive. If the number is positive, print "Number is positive."
    public static void main(String[] args) {
        int a = 4;
        int b = -23;
        if (a > 0){
            System.out.println("Number is positive: "+ a);
        } else {
            System.out.println("Number is not positive: " + a);
        }
        if (b > 0){
            System.out.println("Number is positive: " + b);
        } else {
            System.out.println("Number is not positive: " + b);
        }


    //Task: If-Else Statement
    // Write a program that checks if a given number is even.
    // If the number is even, print "Number is even." Otherwise, print "Number is odd."

        int c = 21;
        int d = 8;
        if (c % 2 == 0){
            System.out.println("Number is even: " + c);
        } else {
            System.out.println("Number is odd: " + c);
        }
        if (d % 2 == 0){
            System.out.println("Number is even: " + d);
        } else {
            System.out.println("Number is odd: " + d);
        }

    //Task: If-Else-If Statement
    //Write a program that checks the temperature in Celsius
    //and prints a corresponding message based on the temperature range:
    //If temperature is less than 0, print "Freezing cold!"
    //If temperature is between 0 and 15, print "Chilly weather."
    //If temperature is between 16 and 25, print "Comfortable temperature."
    //If temperature is above 25, print "Hot weather!"

        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        int temp = temperature.nextInt();
        if (temp < 0){
            System.out.println("Freezing cold!");
        }
        if (temp >= 0 & temp <= 15){
            System.out.println("Chilly weather!");
        }
        if (temp >= 16 & temp <= 25){
            System.out.println("Comfortable weather!");
        }
        if (temp >= 26){
            System.out.println("Hot weather!");
        }


    //Task: If-Else Statement
    //Write a program that checks if a given year is a leap year. If the year is a leap year, print "Leap year."
    // Otherwise, print "Not a leap year."
    // (A leap year is divisible by 4 but not divisible by 100, except if it is divisible by 400.)

        int l = 2012;
        boolean leap = false;
        if (l % 4 == 0) {
            if (l % 100 == 0) {
                if (l % 400 ==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
            else
            leap = false;

        if (leap)
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");

    //Task: If Statement
    //Write a program that checks if a given string is empty. If the string is empty, print "String is empty."

        String input = "";
        if (input.isEmpty()){
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}
