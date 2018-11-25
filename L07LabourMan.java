import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class L07LabourMan 
{//Start class

	public static void main(String[] args)
	{//Start main
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter bw = null;
		String szName;
		int iHours;
		Float fPay;
		
		
		try
		{//End main

			file = new FileWriter("PaySlip.txt", false);
			bw = new BufferedWriter(file);
			
			System.out.print("Enter your full name: ");
			szName = szKeyboard.nextLine();
			System.out.print("Enter the number of hours worked: ");
			iHours = iKeyboard.nextInt();
			fPay = (float) (9.50 * iHours);
			
			bw.write("Employee: " + szName);
			bw.write("Company: Coding UK");
			
			bw.write("Hours Worked: "+ iHours);
			bw.write("Pay earned: £"+fPay);
		}//End try
		catch(Exception e)
		{//Start main
			System.out.println("Error - Writing to File: " + e);
		}//End catch
		finally 
		{
			//finally runs regardless of whether the try has worked
			//the aim of a finally is to tidy up any loose ends
			//if the contents within read is not equal to nothing i.e. it was possible to open and read
			//close the file (try) if the file was not loaded catch the exception IOException
			try
			{
				bw.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Error - Closing BufferWriter: " + e);
			}

			try
			{
				file.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Error - Closing FileWriter: " + e);
			}
			System.out.println("\n\n--- File End ---");
		}//
	}//End main

}//End class
