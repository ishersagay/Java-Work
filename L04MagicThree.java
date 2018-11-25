import java.util.Scanner;
public class L04MagicThree 
{

	public static void main(String[] args) 
	{
		Scanner  iKeyboard = new Scanner(System.in);


		boolean bStop = false;
		int iLimit = 10;
		int iMagicNum;
		int iAdd = 17;
		int idivide = 6;
		int iMagicEnd;
		
		System.out.print("Enter a number between 1 and 10:");
		iMagicNum = iKeyboard.nextInt();

		while(bStop == false)
		{
			iMagicEnd = iMagicNum * iMagicNum;
			iMagicEnd = iMagicNum + iMagicEnd;
			iMagicEnd = iMagicEnd / iMagicNum;
			iMagicEnd = iMagicEnd + iAdd;
			iMagicEnd = iMagicEnd - iMagicNum;
			iMagicEnd = iMagicEnd / idivide;

			if(iLimit < iMagicNum)
			{

				for(int i =10; i == 10; i--)
				{

				}//end for

				bStop = true;

			}//End if

			else
			{
				System.out.print("The number you entered is not 1 to 10.");
			}//end else
		}//end while

	}//End main

}//End class

