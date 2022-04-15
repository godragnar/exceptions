package exceptionsdemo;

public class ThrowsDemo {
	
	void Divison() throws ArithmeticException
	{
		int a =45,b=10,rs;
		rs=a/b;
		System.out.println("\n\tThe Result is"+rs);
	}


	public static void main(String[] args) {
		
		ThrowsDemo T=new ThrowsDemo();
		try
		{
			T.Divison();
		}
		catch(ArithmeticException ae)
		{
			System.err.print("\n\tError :" + ae.getMessage());
		}
		System.out.println("\n\tEnd of the Program");
	}

}
