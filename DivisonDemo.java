package exceptionsdemo;

import java.util.Scanner;

public class DivisonDemo {

	public static void main(String[] args) {
		
		double a,b,result;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Input 2 Integers :");
		a=s.nextDouble();
		b=s.nextDouble();
		
		try
		{		
			result=a/b;
			System.out.println("Result ="+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero Error- Enter non-zero value");
			System.out.println("Exception Description :"+e.getMessage());
			System.out.println("Exception Name & Description :"+e.toString());
			
			e.printStackTrace();
		}
		finally //clean-up operations
		{
			s.close();
			System.out.println("In Finally Block - Program Execution ended");
		}
		
	}
	
	
	

}
