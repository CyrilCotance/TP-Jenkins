package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivisionOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.OperationCommand;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * @author Cyril
 * Classe main de l'application
 */
public class Application {

    public static void main(String[] args) {

        boolean continueLoop = true;
        boolean next;
        String readKeyboard;
        OperationCommand op;

        String operandA;
        String operandB;
        String continueString;

        do {

            System.out.println("Type of Operation : ");
            System.out.println("- 1 : Addition");
            System.out.println("- 2 : Subtraction");
            System.out.println("- 3 : Division");
            System.out.println("- 4 : Multiplication");
            System.out.println("- 5 : Display History");
            System.out.println("- 9 : Quit");
            readKeyboard = KeyboardUtils.readFromKeyboard("");


            switch (readKeyboard){
                case "1": // Addition

                    operandA = KeyboardUtils.readFromKeyboard("Enter Value a : ");
                    operandB = KeyboardUtils.readFromKeyboard("Enter Value b : ");

                    op = new AdditionOperation(operandA, operandB);

                    break;
                case "2": // Substration

                    operandA = KeyboardUtils.readFromKeyboard("Enter Value a : ");
                    operandB = KeyboardUtils.readFromKeyboard("Enter Value b : ");

                    op = new SubstractionOperation(operandA, operandB);

                    break;
                case "3": // Division

                    operandA = KeyboardUtils.readFromKeyboard("Enter Value a : ");
                    operandB = KeyboardUtils.readFromKeyboard("Enter Value b : ");

                    op = new DivisionOperation(operandA, operandB);

                    break;
                case "4": // Multiplication

                    operandA = KeyboardUtils.readFromKeyboard("Enter Value a : ");
                    operandB = KeyboardUtils.readFromKeyboard("Enter Value b : ");

                    op = new MultiplicationOperation(operandA, operandB);

                    break;
                case "5": // Display History

                    // If enter 5
                    // Display last calculate :
                    //    1 + 1 = 2
                    //    2 * 3 = 6
                    break;
                case "9": // Quit
                    continueLoop = false;
                    break;

                default:
                    System.out.println("Sorry, i don't understand...");
                    break;
            }

            do {
                System.out.println("Do another operation? y/n");
                continueString = KeyboardUtils.readFromKeyboard("");
                if ("y".equalsIgnoreCase(continueString)){
                    next = false;
                } else if ("n".equalsIgnoreCase(continueString)){
                    next = false;
                    continueLoop = false;
                } else {
                    next = true;
                    System.out.println("Sorry, i don't understand...");
                }
            }while(next);


        }while(continueLoop);

        System.out.println("See you !");
    }

}
