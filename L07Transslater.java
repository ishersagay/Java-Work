/**
 * @version 1 21/4/17
 * @author 13sagayi
 * @aim to translate words
 */
import java.util.Scanner ;
import java.io.File ;
public class L07Transslater
{

	public static void main(String[] args) 
	{
		//declaring the objects
		Scanner szKeyboard = new Scanner(System.in) ;
		Scanner inFile = null ;

		//declaring the variables
		String[][] szTranslator = new String[16][4] ;
		int i = 0 ;
		String szRefNum , szLanguage ;
		boolean bValid ;

		try
		{
			//opening the file
			inFile = new Scanner( new File("WORDS.csv") ) ;

			//skipping the headers
			inFile.nextLine();

			//reading in the table
			while (inFile.hasNextLine())
			{
				//reading in the line
				//removing speach marks and white space then spliting into an array
				szTranslator[i] = inFile.nextLine().replaceAll("\"", "").trim().split(",") ;			

				//adding the count to move to the next line
				i++;
			}


			//priting out the into
			System.out.println("The following can be translated into French or German");
			for (i = 0; i < szTranslator.length; i++) 
			{
				System.out.printf("%-5s%-10s%n", szTranslator[i][0] , szTranslator[i][1]);
			}

			System.out.println();

			//asking the user what word to translate
			do
			{
				//asking the user
				System.out.print("Choose a word/phrase to translate from the table above (enter the ID number): ");
				szRefNum = szKeyboard.nextLine() ;

				bValid = true ;

				//checking the the number is valid
				if (!szRefNum.matches("[0-9]+"))
				{
					System.out.println("That is not a valid number");
					bValid = false ;
				}
				else if (Integer.parseInt(szRefNum) < 1 || Integer.parseInt(szRefNum) > 16)
				{
					System.out.println("That is not in range");
					bValid = false ;
				}

			} while (bValid == false) ;

			//responding the the users choice
			System.out.println("You have chosen the word \"" + szTranslator[Integer.parseInt(szRefNum)-1][1] + "\"");

			System.out.println();

			//asking the user what to translate the word into
			do
			{
				//asking the user
				System.out.print("Would you like to translate \"" + szTranslator[Integer.parseInt(szRefNum)-1][1] + "\" into German (G) or French (F)? ");
				szLanguage = szKeyboard.nextLine();
				
				//checking if the choice is valid
				if (!szLanguage.matches("[gfGF]{1}"))
				{
					System.out.println("That is an invalid choice");
				}
				
			} while (!szLanguage.matches("[gfGF]{1}")) ;
			
			//printing out the translation 
			if (szLanguage.equalsIgnoreCase("f"))
			{
				//finding the word in the French column and printing it
				System.out.println(szTranslator[Integer.parseInt(szRefNum)-1][1] + " in French is " + szTranslator[Integer.parseInt(szRefNum)-1][3]) ;
			}
			else
			{
				//finding the word in the German column and printing it
				System.out.println(szTranslator[Integer.parseInt(szRefNum)-1][1] + " in German is " + szTranslator[Integer.parseInt(szRefNum)-1][2]) ;
			}
			
		} 
		catch (Exception e)
		{
			System.out.println("Error: " + e);
		}
		finally 
		{
			//closing objects
			if (inFile != null)
			{
				inFile.close();
			}
			szKeyboard.close();
			
			System.out.println("\n\n--- File End ---");
		}





	}//end main

}//end class