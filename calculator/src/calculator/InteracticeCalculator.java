package calculator;

import java.util.Scanner;

import calculator.operations.*;

public class InteracticeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int numberA = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Please enter the second number: ");
		int numberB = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Please enter an operation: ");
		String operation = scan.nextLine();
		
		scan.close();
		
		double result = 0;
		
		if(operation.equals("add")){
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
		} else if (operation.equals("subtract")) {
			SubOperation sub = new SubOperation();
			sub.setA(numberA);
			sub.setB(numberB);
			result = sub.getResult();
		} else if (operation.equals("multiply")) {
			mulOperation multiply = new mulOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result = multiply.getResult();
		} else if (operation.equals("divide")) {
			DivOperation divide = new DivOperation();
			divide.setA(numberA);
			divide.setB(numberB);
			result = divide.getResult();
		} else {
			System.out.println("Please enter a valid operation i.e.(add, subtract, multiply, divide)");
			
		}
		
		System.out.println("The result is: " + result);
		
		
	}
}
