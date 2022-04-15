package exceptionsdemo;

import java.util.Scanner;

public class Divison {
	
	public static void main(String[] args) {
		int a,b,result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input 2 Integers:");
		
		a=s.nextInt();
		b=s.nextInt();
		
		result=a/b; //JRE throws arithmetic Exception
		
		System.out.println("Result ="+result);
		
		s.close();
	}

}
