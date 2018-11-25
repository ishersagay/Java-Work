import java.util.Scanner;
public class L07CarManufacturers
{//Start class

	public static void main(String[] args)
	{//Start main
		Scanner szkeyboard = new Scanner(System.in);		
		String[][] szCarsMethod = new String[3][2];
		String szTableMethod = "";
		int i;
		int j = 1;
		
		
		
		System.out.print("Please enter the make of car 1: ");
		szCarsMethod[0][0] =	szkeyboard.nextLine();
		
		System.out.print("Please enter the colour of the car ");
		szCarsMethod[0][1] = szkeyboard.nextLine();
		
		System.out.print("Please enter the make of car 2: ");
		szCarsMethod[1][0] = szkeyboard.nextLine();
		
		System.out.print("Please enter the clour of the car ");
		szCarsMethod[1][1] = szkeyboard.nextLine();
		
		System.out.print("Please enter the make of car 3: ");
		szCarsMethod[2][0] = szkeyboard.nextLine();
		
		System.out.print("Please enter the color of the car ");
		szCarsMethod[2][1] = szkeyboard.nextLine();
		
		//add space and heading for task
		
		szTableMethod = szTableMethod + "\n---------------------------------\n";
		szTableMethod = szTableMethod + String.format("%2s %-10s %2s %-10s %2s%n" 
				, "|" , "Make" , "|" , "Colour" , "|");
		szTableMethod = szTableMethod + "----------------------------------\n";
		
		for(i=0; i< szCarsMethod.length; i++)
		{
			szTableMethod= szTableMethod + String.format("%2s %-5s %2s %-5s %-10s %2s%n" , 
					"|"+j+")","|", szCarsMethod[i][0], "|",szCarsMethod[i][1],"|");
			j = j+1;
		}
		szTableMethod = szTableMethod + "-----------------------------------\n";
		System.out.println(szTableMethod);
	}//End main

}//End class
