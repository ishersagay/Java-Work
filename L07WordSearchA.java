import java.io.File;
import java.util.Scanner;
public class L07WordSearchA
{
	public static void main(String[] args) 
	{
		int iCount = 0 , i = 0;
		Scanner infile = null;
		String szLetter;	
		try 
		{//Start try
			infile = new Scanner (new File("BATCH.txt"));
			for(i=0; i <249; i++)
			{//Start for
				
				szLetter = infile.nextLine().trim();
				System.out.println(i + ". " + szLetter);

				if(szLetter.equalsIgnoreCase("a"))
				{//Start if
				
					iCount++;
				
				}//end if
			}//end for 
		}//end try

		catch (Exception e)
		{//Start catch
		
			System.out.println("Error: "+e);
		
		}//end catch
		finally 
		{//Start finally
			
			System.out.println("\nThe letter A appears "+ iCount +" times in the file BATCH.txt");
			System.out.println("\n--- File End ---");
		
		}//end finally
	}//end main
}//end class