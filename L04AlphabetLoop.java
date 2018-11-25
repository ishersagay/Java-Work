import java.util.Scanner;
public class L04AlphabetLoop
{

	public static void main(String[] args)
	{
		Scanner szKeyboard = new Scanner(System.in);
		String szChoice;
		char cChoice;
		int i,iLength;
				
		System.out.print("How would you like to sort the alphabet, Ascending (A) or Descending (D)?");
		szChoice = szKeyboard.next();
		cChoice = szChoice.charAt(0);
		
		if(cChoice == 'A')
		{
			
			System.out.println("abcdefghijklmnopqrstuvwxyz");
		}//End if
			
		else if(cChoice == 'D')
		{
		System.out.println("zyxwvutsrqponmlkjihgfedcba");	
		}//End else
		
		else
		{
			System.out.println("You have not enterd the correct value");
		}//End else

	}//End main

}//End class
