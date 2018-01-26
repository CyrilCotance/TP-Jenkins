package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.OperationCommand;
import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {
	
    public static void main(String[] args) {

    	boolean continue_loop = true;
		boolean next = true;
    	OperationCommand add;
    	String readKeyboard;

    	String operand_a;
    	String operand_b;
    	String continue_string = null;
    	
    	do {
    		
    		operand_a = "";
    		operand_b = "";
    		
	        System.out.println("Type of Operation : ");
	        System.out.println("- 1 : Addition");
	        System.out.println("- 2 : Subtraction");
	        System.out.println("- 3 : Division");
	        System.out.println("- 4 : Multiplication");
	        System.out.println("- 5 : Display History");
	        System.out.println("- 9 : Quit");
	    	readKeyboard = KeyboardUtils.readFromKeyboard();
	    	
	    	
	    	switch (readKeyboard){
				case "1": // Addition

			        System.out.println("Enter Value a : ");
			        operand_a = KeyboardUtils.readFromKeyboard();
			        System.out.println("Enter Value b : ");
			        operand_b = KeyboardUtils.readFromKeyboard();
			        
			        add = new AdditionOperation(operand_a,operand_b);
			        
			        System.out.println("Result : "+add.getCurrentValue());
					
					break;
				case "2": // Substration

			        System.out.println("Enter Value a : ");
			        System.out.println("Enter Value b : ");
			        System.out.println("Result : ");
					
					break;
				case "3": // Division

			        System.out.println("Enter Value a : ");
			        System.out.println("Enter Value b : ");
			        System.out.println("Result : ");
					
					break;
				case "4": // Multiplication

			        System.out.println("Enter Value a : ");
			        System.out.println("Enter Value b : ");
			        System.out.println("Result : ");
					
					break;
				case "5": // Display History

			        // If enter 5
			        // Display last calculate :
			        //    1 + 1 = 2
			        //    2 * 3 = 6
					break;
				case "9": // Quit
					continue_loop = false;
					break;
	
				default:
		    		System.out.println("Sorry, i don't understand...");
					break;
	    	}
	    	
	    	do {
		    	System.out.println("Do another operation? y/n");
		    	continue_string = KeyboardUtils.readFromKeyboard();
		    	if(new String("y").equalsIgnoreCase(continue_string)){
		    		next = false;
		    	}else if (new String("n").equalsIgnoreCase(continue_string)){
		    		next = false;
		    		continue_loop = false;
		    	}else {
		    		System.out.println("Sorry, i don't understand...");
		    	}
	    	}while(next);
	    	
	    	
    	}while(continue_loop);
    	
    	System.out.println("See you !");
    }

}
