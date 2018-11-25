/**
 * @author isher
 * @Version L6
 * @Lucky Dip
 */
import java.util.Scanner;
import java.util.Arrays;
public class L06LuckyDipLottery
{//Start Class

	public static void main(String[] args)
	{//Start Main 
		Scanner iKeyboard = new Scanner(System.in);
		int i,iNum;
		int[] iRanNums = new int[5];
		iRanNums[0] = (int) (Math.random()*60);
		iRanNums[1] = (int) (Math.random()*60);
		iRanNums[2] = (int) (Math.random()*60);
		iRanNums[3] = (int) (Math.random()*60);
		iRanNums[4] = (int) (Math.random()*60);
		Arrays.sort(iRanNums);
		
		System.out.println("Your lucky dip numbers are ... ");

		for(i = 0; i<5; i++)
		{
			System.out.print(iRanNums[i]+" ");
			
		}//End for 
		
		iNum = (int) (Math.random()*60);
		System.out.print("Bonus ball: "+iNum );
		
	}//End Main

}//End class
