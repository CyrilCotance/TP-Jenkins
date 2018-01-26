package com.imie.tp.calculator;

import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {

	public static String readKeyboard = new String();
	
    public static void main(String[] args) {

    	boolean continue_loop = true;
    	
    	do {
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
			        System.out.println("Enter Value b : ");
			        System.out.println("Result : ");
					
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
					System.out.println("I don't understand.../r/r");
					break;
	    	}
	    	
    	}while(continue_loop);
    	
    	System.out.println("See you !");
    }

}
