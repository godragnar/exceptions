//Program to Load any application

package exceptionsdemo;

public class OutOfMemoryErrorDemo {

	public void createArray(int size)
	{
		try
		{
			Integer[] a =new Integer[size];
		}
		catch(OutOfMemoryError e)
		{
			System.err.println("Array Size too Larage "+e);
			System.err.println("Max JVM Memory "+Runtime.getRuntime().maxMemory());
			System.err.println("Java Version"+Runtime.version());
		}
	}
	
	public static void main(String[] args) {
		
		OutOfMemoryErrorDemo d1 =new OutOfMemoryErrorDemo();
		d1.createArray(1000*1000*1000);
		
	try 
	{		
		Runtime.getRuntime().exec("firefox");
			
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}  
		
		
	
	}	
}
