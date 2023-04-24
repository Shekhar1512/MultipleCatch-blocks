package javaPrograms;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		int a[ ] = new int[5];
		
		try {
			int x =100/0;  //ArithmeticException e
			
			a[6] = 10;   //OutofBoundException e
			
			String s = "";  //it can create NullPointerException if get null value      
					
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
			//a[10]=10; //exception
		}
		
	      catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array bound exception");
		}
		

		catch(NullPointerException e)
		{
			System.out.println("Array bound exception");
		}
		
	
       		
		
		
		
	}

}
