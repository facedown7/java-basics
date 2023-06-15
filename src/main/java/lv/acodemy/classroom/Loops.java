package lv.acodemy.classroom;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for; do while, foreach, while;

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

        String[] fruits = {"banana", "apple", "kiwi", "orange", "pear"};
        //fruits[0] = banana
        //fruits[1] = apple
        //...

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + "; ");
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            if (fruits[i].equals("kiwi")) {
                System.out.println("I found kiwi!");
                break;
            }
        }
        //enhanced for (for each)
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }

        for (int i = 20; i < 41; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even number is: " + sum);

        int tableSize = 6;
        for (int i = 0; i < 6; i++) {
            System.out.println(i * tableSize + " ");

        }

        int table = 10;
        for (int i = 1; i <= table; i++) {
            for (int j = 1; j <= table; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }

        // WHILE LOOP

        int i = 10;
        while (i > 0) {
            System.out.println("Hello world!");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Hello again!");
            j++;
        }

        int o = 0;
        do {
            System.out.println("wtf is this");
            o++;
        } while (o < 10);

        //scanner

        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);

        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Try harder");
            }
        }

        //TODO: Limit guess with 3 times;

        String name = "Stas";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed = reversed + name.charAt(l);
        }
        System.out.println(reversed);
    }

    }

