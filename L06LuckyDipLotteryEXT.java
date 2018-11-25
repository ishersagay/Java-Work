/**
 * @author isher
 * @Version L6
 * @Lucky Dip
 */
import java.util.Arrays;
import java.util.Scanner;

public class L06LuckyDipLotteryEXT
{//End main

	public static void main(String[] args) 
	{//Start main
		
		Scanner iKeyboard = new Scanner(System.in);
		int i,j,iNum,iInput;
		int[] iRanNums = new int[5];

	
		
		System.out.println("How many lines would you like? ");
		iInput = iKeyboard.nextInt();
		
		System.out.println("Your lucky dip numbers are ... ");

		for(j = 0; j<iInput; j++)
		{//Start for loop
			iRanNums[0] = (int) (Math.random()*60);
			iRanNums[1] = (int) (Math.random()*60);
			iRanNums[2] = (int) (Math.random()*60);
			iRanNums[3] = (int) (Math.random()*60);
			iRanNums[4] = (int) (Math.random()*60);
			Arrays.sort(iRanNums);
			
		for(i = 0; i<5; i++)
		{//Start for loop
			
			System.out.print(iRanNums[i]+" ");
	
		}//End for 
		
		iNum = (int) (Math.random()*60);
		System.out.print("Bonus ball "+iNum );
		System.out.println();
	
		}//End for loop
		
	}//End main

}//End class
