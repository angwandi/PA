package com.company;

import java.util.Scanner;

public class RemindName {
    static void remindName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
