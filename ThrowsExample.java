package exceptionsdemo;

import java.io.IOException;

public class ThrowsExample {

	
	void myMethod(int a ) throws IOException,ArithmeticException
	{
		if(a==1) 
			throw new IOException("IO Exeption Occured");
		else
			throw new  ArithmeticException("Arthimetic Exception");
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExample t =new ThrowsExample();
		try
		{
			t.myMethod(9);
			
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}

	}

}
