import java.util.Scanner;

public class L07Introduction2DArrays 
{
	public static void main(String[] args) 
	{	
		String[][] szCarsMethod1 = new String[3][2];
		String szTableMethod1 = "";
		int i;
		
		//add space and heading for task
		szTableMethod1 = szTableMethod1 + "\n---------------------------------\n";
		szTableMethod1 = szTableMethod1 + String.format("%2s %-10s %2s %-10s %2s%n" 
				, "|" , "Make" , "|" , "Colour" , "|");
		szTableMethod1 = szTableMethod1 + "----------------------------------\n";
		
		for(i=0; i< szCarsMethod1.length; i++)
		{
			szTableMethod1= szTableMethod1 + String.format("%2s %-10s %2s %-10s %2s%n" , 
					"|", szCarsMethod1[i][0], "|",szCarsMethod1[i][1],"|");
		}
		szTableMethod1 = szTableMethod1 + "-----------------------------------\n";
		System.out.println(szTableMethod1);
		System.out.println();
		System.out.println();
		System.out.println("===================================");
		System.out.println("A. Creating 2D Arrays - Method 1");
		System.out.println("===================================");
		

		
		//add space and heading for task	
		String[][] szCarsMethod11 = {{"Ford","Blue"},{"Lamborgin","Red"},{"Bently","Green"},};
		String szTableMethod11 = "";
		int i1;
		
		//add space and heading for task
		szTableMethod11 = szTableMethod11 + "\n---------------------------------\n";
		szTableMethod11 = szTableMethod11 + String.format("%2s %-10s %2s %-10s %2s%n" 
				, "|" , "Make" , "|" , "Colour" , "|");
		szTableMethod11 = szTableMethod11 + "----------------------------------\n";
		
		for(i1=0; i1< szCarsMethod11.length; i1++)
		{
			szTableMethod11= szTableMethod11 + String.format("%2s %-10s %2s %-10s %2s%n" , 
					"|", szCarsMethod11[i1][0], "|",szCarsMethod11[i1][1],"|");
		}
		szTableMethod11 = szTableMethod11 + "-----------------------------------\n";
		System.out.println(szTableMethod11);
		System.out.println();
		System.out.println();
		System.out.println("===================================");
		System.out.println("B. Creating 2D Arrays - Method 2");
		System.out.println("===================================");



		
		//add space and heading for task
		
		Scanner szkeyboard = new Scanner(System.in);		
		String[][] szCarsMethod111 = new String[3][2];
		String szTableMethod111 = "";
		int i11;
		
		
		
		System.out.println("Please enter the make of car 1: ");
		szCarsMethod111[0][0] =	szkeyboard.nextLine();
		
		System.out.println("Please enter the colour of the car ");
		szCarsMethod111[0][1] = szkeyboard.nextLine();
		
		System.out.println("Please enter the make of car 2: ");
		szCarsMethod111[1][0] = szkeyboard.nextLine();
		
		System.out.println("Please enter the clour of the car ");
		szCarsMethod111[1][1] = szkeyboard.nextLine();
		
		System.out.println("Please enter the make of car 3: ");
		szCarsMethod111[2][0] = szkeyboard.nextLine();
		
		System.out.println("Please enter the color of the car ");
		szCarsMethod111[2][1] = szkeyboard.nextLine();
		
		//add space and heading for task
		
		szTableMethod111 = szTableMethod111 + "\n---------------------------------\n";
		szTableMethod111 = szTableMethod111 + String.format("%2s %-10s %2s %-10s %2s%n" 
				, "|" , "Make" , "|" , "Colour" , "|");
		szTableMethod111 = szTableMethod111 + "----------------------------------\n";
		
		for(i11=0; i11< szCarsMethod111.length; i11++)
		{
			szTableMethod111= szTableMethod111 + String.format("%2s %-10s %2s %-10s %2s%n" , 
					"|", szCarsMethod111[i11][0], "|",szCarsMethod111[i11][1],"|");
		}
		szTableMethod111 = szTableMethod111 + "-----------------------------------\n";
		System.out.println(szTableMethod111);
		System.out.println();
		System.out.println();
		System.out.println("================================================");
		System.out.println("C. Creating 2D Arrays - Method 3 with User Input");
		System.out.println("================================================");



		szkeyboard.close();

	}//end main

}//end class