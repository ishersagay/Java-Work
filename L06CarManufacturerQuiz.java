import java.util.Scanner;
public class L06CarManufacturerQuiz 
{//Start Claass

	public static void main(String[] args)
	{//Start main
		Scanner iKeyboard = new Scanner(System.in);
		Scanner szKeyboard = new Scanner(System.in);
		int iCars,i = 0;
		String[] szCars = new String[i];
		
		
		System.out.print("How many car manufactures can you think of? ");
		iCars = iKeyboard.nextInt();
		
		for(i=1; i<iCars+1; i++)
		{//Start for loop
			System.out.println("Enter the name of a car manufacturer "+i+":");
			szCars[i] = szKeyboard.next();
		}//End for loop
		
		i=0;
		System.out.println("You have entered the following car manutfacturers:");
		
		for(i=1; i<iCars+1; i++)
		{
			System.out.print(i+"."); System.out.println(szCars[i]);
		}//End for loop
		
	}//Start maimn

}
