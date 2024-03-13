

public class Start
{
	public static void main(String args[])
	{
		int x=10;
		int y=0;
		int div=0;
		
		try{
		div=x/y;
		System.out.println("The value of div is: "+div);
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception occured arrayindex...");	
		}
		
		catch(RuntimeException e)
		{
			System.out.println("exception occured runtime...");
		}
		
		finally
		{
		System.out.println("Program exitting...");
		}
	
	
	}
	
}