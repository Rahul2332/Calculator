package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public int add(int a, int b){ return (a+b); }
    public int sub(int a, int b){
        return (a-b);
    }
    public int mul(int a, int b){
        return (a*b);
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (a/b);
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        logger.info("Start of Execution");

        System.out.println("-- Welcome to Calculator --\n");
        Main calc = new Main();
        while(true) {
            System.out.println("Choose your operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("-> ");
            int operation = scanner.nextInt();

            if(operation == 5) {
                logger.info("EXIT command");
                logger.info("End of Execution");
                System.exit(0);
            }
            if(operation<1 || operation>4){
                logger.warn("Invalid input");
                continue;
            }

            System.out.print("Enter num 1: ");
            int a = scanner.nextInt();
            System.out.print("Enter num 2: ");
            int b = scanner.nextInt();

            System.out.println("----------");
            System.out.print("Result is: ");

            switch (operation) {
                case 1:
                    logger.info("Addition");
                    System.out.println(calc.add(a,b));
                    break;
                case 2:
                    logger.info("Subtraction");
                    System.out.println(calc.sub(a,b));
                    break;
                case 3:
                    logger.info("Multiplication");
                    System.out.println(calc.mul(a,b));
                    break;
                case 4:
                    logger.info("Division");
                    System.out.println(calc.div(a,b));
                    break;
            }
            System.out.println("----------");
            System.out.println();
        }
    }
}