package devopslab;

import java.util.Scanner;



public class RunCalculator {
	private int numberOne;
	private int numberTwo;
	private String operator;
	Calculator cal = new Calculator();
	
	
	
	public void Run() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please Select a calulation you wish to carry out:");
		System.out.println("A) addtion");
		System.out.println("B) sub");
		System.out.println("C) mul");
		System.out.println("D) div");
		operator = scan.next();
		
		System.out.println("Enter your first number");
		numberOne = scan.nextInt();
		System.out.println("Enter your second number:");
		numberTwo = scan.nextInt();
		
		
		 CalculatorAction(operator, numberOne, numberTwo);
		
	}
	
	private void CalculatorAction(String operator, int numberOne, int numberTwo) {
		if(operator.equalsIgnoreCase("A")) {
			System.out.println(cal.addtion(numberOne, numberTwo));
		}else if(operator.equalsIgnoreCase("B")) {
			System.out.println(cal.subtract(numberOne, numberTwo));
		}else if(operator.equalsIgnoreCase("C")) {
			System.out.println(cal.multiple(numberOne, numberTwo));
		}else if(operator.equalsIgnoreCase("D")){
			System.out.println(cal.divide(numberOne, numberTwo));
		}else {
			System.out.println("invalid operator");
		}
		
	}


}
