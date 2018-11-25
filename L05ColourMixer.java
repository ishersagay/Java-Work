import java.util.Scanner;
public class L05ColourMixer
{

	public static void main(String[] args)
	{

		Scanner szKeyboard = new Scanner(System.in);
		char cChoice,cRed = 'A', cYellow = 'C', cBlue = 'B';
		boolean bStop = false;
		String szChoice;


		System.out.println("# # # # # # The Colour Mixer # # # # # #");
		System.out.println();



		while(bStop = false)
		{//Start while

			System.out.println("<A> Red");	
			System.out.println("<B> Blue");
			System.out.println("<C> Yellow");
			System.out.println("Choose a colour: ");
			szChoice = szKeyboard.nextLine();

			//This will convert the string into a char
			cChoice = szChoice.charAt(0);
		}//End while
		szKeyboard.close();

	} //End Main 

}//End class
