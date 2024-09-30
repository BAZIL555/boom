package basil;

public class calculator {

	public static void main(String[] args) {
		 double num1 = 24;
	        double num2 = 8;
	        char operation = '*
	        		'; // Change this to +, -, *, or /

	        double result = 0;

	        // Perform the calculation based on the operation
	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return; // Exit the program
	                }
	                break;
	            default:
	                System.out.println("Invalid operation selected.");
	                return; // Exit the program
	        }

	        // Display the result
	        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
	    }
	
		// TODO Auto-generated method stub

	}


