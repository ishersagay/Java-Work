import java.io.File;
import java.util.Scanner;
public class L07WhoLivesThereRevisited 
{

	public static void main(String[] args) 
	{
		Scanner szKeyboard = new Scanner(System.in);
		Scanner infile;
		String szInLine;
		String[] szLineArray = new String[2];
		String[] szPeople;
		String[] szNames = new String[2];
		String[] szForenames;
		String[] szSurnames;
		String[] szAddresses;
		int iPeople = 0;
		String szName = "";
		boolean bCheck = false;

		try 
		{
			infile = new Scanner(new File("PEOPLE.csv"));
			szInLine = infile.nextLine();

			while(infile.hasNextLine())
			{
				szInLine = infile.nextLine();
				iPeople++;

			}//end while

			infile.close();

			szPeople = new String[iPeople];
			szForenames = new String[iPeople];
			szSurnames = new String[iPeople];
			szAddresses = new String[iPeople];
			infile = new Scanner(new File("PEOPLE.csv"));

			System.out.println("There are currently "+(iPeople+1)+" employees\n");

			//split entries into forenames, surnames and places
			for (int i = 0; i < szPeople.length; i++) 
			{
				szInLine = infile.nextLine();

				//take "s out of entries 
				szPeople[i] = szInLine.replaceAll("\"", "");;

				//split array into names and places
				szLineArray = szPeople[i].split(",");

				//split names into first and last
				szNames = szLineArray[0].split(" ");

				szForenames[i] = szNames[0];
				szSurnames[i] = szNames[1];

				//put addresses into address array
				szAddresses[i] = szLineArray[1];

			}//end for

			do
			{
				System.out.print("Who are you looking for? ");
				szName = szKeyboard.nextLine().trim();
			}while(szName.matches("^[A-Za-z]"));
			System.out.println("\nSearching the file...");

			for (int i = 0; i < szPeople.length; i++) 
			{
				if (szForenames[i].equalsIgnoreCase(szName) || szSurnames[i].equalsIgnoreCase(szName)) 
				{
					System.out.println(szForenames[i]+" "+szSurnames[i]+" lives at "+szAddresses[i]+"\n");
					bCheck = true;
				}//end if

			}//end for

			if(bCheck != true)
			{
				System.out.println("That person does not work at the company.");
			}

			do
			{
				System.out.print("Would you like to check this against the staff list?(y/n) ");
				szName = szKeyboard.nextLine().trim().toLowerCase().substring(0,1);
			}while(!szName.matches("[yn]"));

			if(szName.matches("y"))
			{
				System.out.println(" ┌───────────────────────────────┬────────────────────────────────────┐");
				System.out.println(" │ Employee Name                 │ Employee Address                   │");
				System.out.println(" ├───────────────────────────────┼────────────────────────────────────┤");
				for (int i = 0; i < szPeople.length; i++) 
				{
					System.out.printf(" │ %-30s│ %-35s│\n",szForenames[i]+" "+szSurnames[i],szAddresses[i]);
				}
			}
				System.out.println(" └───────────────────────────────┴────────────────────────────────────┘");
			infile.close();	
		}
		catch (Exception e) 
		{
			System.out.println("Error: "+e);
		}//end try/catch
		finally
		{
			System.out.println("  --- File end ---");
			szKeyboard.close();
		}
		
		
	}//end main

}//end class