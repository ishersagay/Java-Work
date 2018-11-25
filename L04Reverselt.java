import java.util.Scanner;
public class L04Reverselt 
{

	public static void main(String[] args)
	{
		
		Scanner szKeyboard = new Scanner(System.in);
		
		String szWord;
		int i = 0 , iLength;
		
		System.out.println("Please enter any word:");
		szWord = szKeyboard.next();
		szWord = szWord.toUpperCase();
		iLength = szWord.length();
		
		for(int i1 = iLength - 1 ; i1 >= 0 ; i1-- )
		{
			
			System.out.print(szWord.charAt(i1));
			
		}//End for

	}//End main

}//End class
