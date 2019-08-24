

package Common;

import java.util.Scanner;

public class Screen {

	  
		
		
		public Screen()
		{      
			Scanner ip=new Scanner(System.in);
			int close=0;
			while(close==0)
			{
			System.out.println("Operation Required Press Key\n	1 To Issue\n	2 To Reissue\n	3 To Return\n"
					+"	4 To Display All Books\n	5 To Logout\n"); 
			        
			LibMan.key=ip.nextInt();
				
				switch(LibMan.key) 
				{
				case 1: Issue.issue();
				        break;
				case 2: Reissue.reissue();
				        break;
				case 3:       
					    Return.lautana();	
				         break;
                case 4: Book1.display();
                         break;
                case 5:  System.out.println("Have a Nice Day!!");
                         close=1;
                	     break;
				default : System.out.println("Incorrect input !!!!!!!");
				
				}
					LibMan.restart=0;
					LibMan.count=-1;	
			}
		}
		
	
}
