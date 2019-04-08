package com.company;

import java.util.Scanner;

public class Test {
    static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test your programming knowledge.");
        String question = "Why do we use methods?\n"
                + "1. To repeat a statement multiple times." +
                "\n2. To decompose a program into several small subroutines." +
                "\n3. To determine the execution time of a program." +
                "\n4. To interrupt the execution of a program.";
        System.out.println(question);
        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 2) {
                System.out.println("please try again");
            }
        } while (answer != 2);
    }

}
