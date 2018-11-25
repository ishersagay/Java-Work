import java.util.Scanner;
import java.io.File;
public class L07GcseResults
{//Start Class

	public static void main(String[] args)
	{//Start main
		
		Scanner infile = null;
		
		//declare other variable
		
		//declare the arrays for the GCSE results

		try
		{//Start try
			//open the csv file using the Scanner and File classes
			infile = new Scanner (new File(""));
			
		}//End try
		catch (Exception e)
		{
			System.out.println("Error: " + e);
		}//End catch
		finally
		{
			//Finally runs regardless of whether the try has worked 
			//the aim of a  finally is to tidy up any loose ends
			//if the contents withhin read is not equal to nothing i.e it was possible to open and read
			//close the file (try) if the file was not loaded catch the exception 
			if(infile != null)
			{
				infile.close();
			}
		}		
	}//End main

}//End class
