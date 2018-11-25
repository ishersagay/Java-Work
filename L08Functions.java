import java.util.Scanner;

public class L08Functions 
{
	// "dummy global" variable list as we're using the static keyword to bypass class variables.
	


	//TASK 4 - Take 2 values perform a calculation and return the sum to main
	public static int calc(int iNum1,int iNum2)
	{
		
		return iNum1 + iNum2;
	}

	//TASK 5 - Passing an int and returning a String value
	public static String pass(String szPass)
	{	
		String szScore;
		int iScore;
		iScore = Integer.parseInt(szPass);
		
		if(iScore > 51)
		{
			szScore = "You have passed the exams";
		}
		else
		{
			szScore = "You have failed the exam";
		}
		
		return szScore;
	}

	//TASK 5B - Performing the previous task as a procedure
	public static void pre(String szPass)
	{
		String szScore;
		int iScore;
		iScore = Integer.parseInt(szPass);
		
		
		
		
		if(iScore > 51)
		{
			szScore = "a";
			
		}
		else
		{
			szScore = "b";
		}
	}


	//TASK 6 - Multiplication is just repeated addition
	public static void add()
	{
		
	}

	public static void main(String[] args) 
	{
		//TASK 4 - Take 2 values perform a calculation and return the sum to main
		System.out.println("===================================");
		System.out.println("TASK 4");
		System.out.println("===================================");
		int iNum1;
		int iNum2;
		int iNumf;
		Scanner iKeyboard = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		iNum1 = iKeyboard.nextInt();
		System.out.print("Please enter your second number: ");
		iNum2 = iKeyboard.nextInt();
		
		iNumf = iNum1+iNum2;
		System.out.println(iNum1+ " + "+iNum2+" = "+ iNumf);
		

		
		
		//TASK 5a - Passing an int and returning a String value
		System.out.println("===================================");
		System.out.println("TASK 5A");
		System.out.println("===================================");
		int iScore;
		String szScore,szPass;
		System.out.print("Please enter your text result: ");
		iScore = iKeyboard.nextInt();
		szPass = Integer.toString(iScore);
		
		szScore = pass(szPass);
		
		System.out.println(szScore);



		//TASK 5b - Determining if a Student has passed using a procedure
		System.out.println("===================================");
		System.out.println("TASK 5B");
		System.out.println("===================================");
		
		int iScore1;
		String szScore1,szPass1;
		System.out.print("Please enter your text result: ");
		iScore = iKeyboard.nextInt();
		szPass = Integer.toString(iScore);
		
		szScore = pass(szPass);
		
		System.out.println("");

		

		//TASK 6 - Performing multiplication through repeated addition?
		System.out.println("===================================");
		System.out.println("TASK 6");
		System.out.println("===================================");





	}//end main

}//end class