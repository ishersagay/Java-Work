import java.util.Scanner;
import java.io.File;
public class L07WhoLivesThere
{//Start class

	public static void main(String[] args) 
	{//start main
		//Scanners
		Scanner szKeyboard = new Scanner(System.in);
		Scanner infile = null;
		//Variables
		String szInput;
		String szInLine;
	
		System.out.println("There are currently 50 employees");
		try
		{//Start try
		System.out.println("Who are you looking for?");
		szInput = szKeyboard.nextLine();
			infile = new Scanner (new File("PEOPLE.csv"));
					
			//This will check the file for the user inputs 
			szInLine = infile.nextLine();
			for(int i =0; i<50; i++)
			{//Start for loop
				szInLine = infile.nextLine().trim();
				if(szInput.contains(szInput))
				{//Start if
					
				}//End if
				

			}//End for
		}//End try
		catch(Exception e)
		{//Start Catch
			System.out.println("Error:" +e);
		}//End catch
		finally
		{//Start finally
			if(infile != null)
			{
				infile.close();
				szKeyboard.close();

			}
			System.out.println("\n\n--- File End ---");
		}//End finally
		
	}//End main

}//End class
