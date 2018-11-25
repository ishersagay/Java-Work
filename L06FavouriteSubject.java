import java.util.Scanner;
public class L06FavouriteSubject
{//Start Class
	public static void main(String[] args)
	{//Start main
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);
		
		int iSubjects;
		String szSubjects;
		
		System.out.println("How many of your GCSE subjects do you enjoy?");
		iSubjects = iKeyboard.nextInt();
		
		for(int i =1; i<iSubjects+1; i++)
		{//Start for
			System.out.println("Enter subject "+i );
			szSubjects = szKeyboard.nextLine();
		}//End for
		
	}//End main
 
	
}//End Class
