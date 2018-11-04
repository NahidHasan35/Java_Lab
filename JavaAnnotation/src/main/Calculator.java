package main;

import java.util.Scanner;

/** 
 *<h1>Calculating Numbers!</h1>
 *The calculator program implements an application that
 *just add or subtract two  integer numbers and prints it
 * on the screen
 * <p>
 * <b>Note:</b> Always giving two integers because it works with integer
 * @author Nahid Hasan
 * @version 1.0
 * @since 29-10-2018
 */
public class Calculator {
	
	static Scanner input = new Scanner(System.in);
	
	/**
	 * it is addition method
	 * which just take two input
	 * @param num1 taking first input 
	 * @param num2 taking another input 
	 * @return added result 
	 */
	public static int addition(int num1,int num2) {
		return num1+num2;
	}
	/**
	 * it is subtract method
	 * which just take two input
	 * @param num1 taking first input 
	 * @param num2 taking next input 
	 * @return subtracted result
	 */
	public static int subtraction(int num1,int num2) {
		return num1-num2;
	}
	/**
	 * it is suntraction method
	 * which just take two input
	 * @param num1 taking first input 
	 * @param num2 taking another input 
	 * @return multiplicated result
	 */
	public static int multiplication(int num1,int num2) {
		return num1*num2;
	}
	/**
	 * it is divison method
	 * which just take two input
	 * @param num1 taking first input 
	 * @param num2 taking another input 
	 * @return divided value
	 */
	public static double division(int num1,int num2) {
		return (double)num1/num2;
	}
	/**
	 * it just mod the first input by second input
	 * @param num1 taking first input 
	 * @param num2 taking another input 
	 * @return modded value
	 */
	public static int mod(int num1,int num2) {
		return num1%num2;
	}
	
	/**
	 * main method to run the profram
	 * @param args unused 
	 */
	public static void main(String args[]) {
		//Enter the first number
		System.out.print("Enter the number:");
		int num1 = input.nextInt();
		
		//Enter the next number
		System.out.print("Enter the next number:");
		int num2 = input.nextInt();
		
		//Select operation 
		System.out.println("Select operation:");
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.Division");
		System.out.println("5.Mod");
		int opt = input.nextInt();
		if(opt==1) {
			int res1 = addition(num1,num2);
			System.out.println("Added value is "+res1);
		}
		else if(opt==2){
			int res1 = subtraction(num1,num2);
			System.out.println("Subtracted value is "+res1);
		}
		else if(opt==3){
			int res1 = multiplication(num1,num2);
			System.out.println("Multiplied value is "+res1);
		}
		else if(opt==4){
			double res1 = division(num1,num2);
			System.out.println("Divided value is "+res1);
		}
		else if(opt==5){
			int res1 = mod(num1,num2);
			System.out.println("modded value is "+res1);
		}
	}
	
}
