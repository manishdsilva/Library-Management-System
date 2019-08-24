package Common;

public class Reissue {

	
	public static void reissue() {
		//System.out.println(" Reissue ?\n" + "answer 'yes' or 'no'   ");
		//int ans = asc.nextInt();
		
		
			//System.out.println("Which one?");
		    // int a = asc.nextInt();
			Calculate_Fine cf=new Calculate_Fine();
			cf.calculate_fine();
			if (cf.fine == 0 )
			{
				Issue.issue();
			}
			else
			{
				System.out.println("Your fines are due!\n"+"You have to pay $"+ cf.fine );
			}
		
		
		
	    }
		
		
		
		
	}

