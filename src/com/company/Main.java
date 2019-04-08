package com.company;

import static com.company.Count.count;
import static com.company.End.end;
import static com.company.Greeting.greet;
import static com.company.GuessAge.guessAge;
import static com.company.RemindName.remindName;
import static com.company.Test.test;

public class Main {
    public static void main(String[] args) {
        greet("2ms Aid", "2019");
        remindName();
        guessAge();
        count();
        test();
        end();
    }
}

