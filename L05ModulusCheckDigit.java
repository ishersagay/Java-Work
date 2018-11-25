import java.util.Scanner;
public class L05ModulusCheckDigit
{

	public static void main(String[] args)
	{//Start main
		Scanner iKeyboard = new Scanner(System.in);
		int iUser;
		boolean bStop = false;
		String szUser , szInput;
		String szPresence = " ";
		int iLength;
		int i1, i2, i3, i4, i5, i6, i7, i8;
		int iTotal,iLength1,iFinal;
		char cCo;


		System.out.println("Please enter your bank account number");
		iUser = iKeyboard.nextInt();
		szInput = String.valueOf(iUser);
		iLength1 = szInput.length();
		szUser = String.valueOf(iUser);

		//This is the validation check
		while(szInput != szPresence || iLength1 != 8 || !szInput.equals(" "))
		{

			do //This is the validation check - do while
			{

				while(szInput != szPresence || iLength1 != 8)
				{//while loop for the whole validation 

					while(!szInput.equals(" "))
					{
						System.out.println("You have not entered anything please redo it");
						if(!szInput.equals(" "))
						{
							break;
						}

						else
						{

							iUser = iKeyboard.nextInt();
							szInput = String.valueOf(iUser);
							szUser = String.valueOf(iUser);					
						}//End else
				
					}//End while

					while(iLength1 != 8)
					{
						System.out.println("You have not entered the correct length");
						iUser = iKeyboard.nextInt();
						szInput = String.valueOf(iUser);
					}//End while for the length check

					while(!iKeyboard.hasNext("[^a-zA-Z]"))
					{
						System.out.println("You have not entered the correct length");
						iUser = iKeyboard.nextInt();
						szInput = String.valueOf(iUser);
					}//End while. That check if its a letter

				}//End while loop for the whole validation

			}while(szInput != szPresence || iLength1 != 8 );

		}//End whole loop while

		//This is will convert the characters into integers
		cCo = szUser.charAt(0);
		i1 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(1);
		i2 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(2);
		i3 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(3);
		i4 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(4);
		i5 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(5);
		i6 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(6);
		i7 = Integer.parseInt(String.valueOf(cCo));
		cCo = szUser.charAt(7);
		i8 = Integer.parseInt(String.valueOf(cCo));

		//This is the modulus Check digit
		i1 = i1 * 8;
		i2 = i2 * 7;
		i3 = i3 * 6;
		i4 = i4 * 5;
		i5 = i5 * 4;
		i6 = i6 * 3;
		i7 = i7 * 2;
		i8 = i8 * 1;

		iTotal = i8+i7+i6+i5+i4+i3+i2+i1;
		iTotal = iTotal&11;
		iFinal = 11-iTotal;
		//

		System.out.println(iFinal);	

	}//End main

}//End class
