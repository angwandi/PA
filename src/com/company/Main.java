package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        var scanner = new Scanner(System.in);
        System.out.println("Hello! My name is 2ms.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");

        // reading a name
        var yourName = scanner.next();

        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        // reading all remainders
       int age = ((reminder3 % 3) * 70 + (reminder5 % 5) * 21 + (reminder7 % 7) * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
