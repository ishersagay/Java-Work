
public class L04SpellMan 
{

	public static void main(String[] args) 
	{

		int i, j;
		
        //TASK 1
		System.out.println("====================================================================");
		System.out.println("TASK 1 - NESTED FOR OUTPUT 6 ROWS OF 10*");
		System.out.println("====================================================================");
		for(i=0; i<=6; i++)
		{
			for(j=0; j<=10; j++)
			{
				System.out.print("*");						
			}//End for
			System.out.println(" ");
		}//End for
		
		
		//TASK 2
		System.out.println("======================================================================");
		System.out.println("TASK 2 - NESTED FOR A RIGHT ANGLED TRIANGLE MADE WITH * ACROSS 4 ROWS");
		System.out.println("======================================================================");
		for(i=0; i<4; i++)
		{
			i++;
			for(j=1; j<4; j++)
			{
				
				System.out.print("*");
			}//End for
				System.out.println("");
		}//End for

		

		//TASK 3
		System.out.println("============================================================================");
		System.out.println("TASK 3 - NESTED FOR A RIGHT ANGLED TRIANGLE MADE WITH NUMBERS ACROSS 5 ROWS");
		System.out.println("============================================================================");
		

		

		//TASK 4
		System.out.println("=========================================================================================");
		System.out.println("TASK 4 - NESTED FOR A COUNTING DOWN RIGHT ANGLED TRIANGLE MADE WITH NUMBERS ACROSS 5 ROWS");
		System.out.println("=========================================================================================");
		

		
		
		
		//TASK 5
		System.out.println("=========================================================================================");
		System.out.println("TASK 5 - NESTED FOR AN UPSIDE DOWN RIGHT ANGLED TRIANGLE MADE WITH NUMBERS ACROSS 5 ROWS");
		System.out.println("=========================================================================================");
		

	}

}
