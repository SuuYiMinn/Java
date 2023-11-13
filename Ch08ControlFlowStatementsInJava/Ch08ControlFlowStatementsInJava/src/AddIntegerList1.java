/*
 * File: AddIntegerList.java
 * -------------------------
 * This program reads integers one per line until the
 * user enters a special sentinel value to signal the
 * end of the input. At that point, the program
 * prints the sum of the numbers entered so far. */

import acm.program.ConsoleProgram;

public class AddIntegerList1 extends ConsoleProgram {
        public void run() {
                final int SENTINEL = 0;
                println("This program adds a list of integers.");
                println("Enter values, one per line, using " + SENTINEL);
                println("to signal the end of the list.");
                int total = 0;
                int value = readInt(" ? ");
                while (value != SENTINEL) {
                        total += value;
                        value = readInt(" ? ");
                }
                println("The total is " + total + ".");
        }
}