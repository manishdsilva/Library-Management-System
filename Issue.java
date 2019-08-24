package Common;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Issue {
	 
 Book1 ib = new Book1() ;
  static Scanner asc = new Scanner(System.in) ;
 
	
	public static void issue() {
	
		
		
		
	System.out.println("Enter the book you want to issue");
	int in = asc.nextInt();
	String iin;
	
	
	
	
	if (in == 1157 || in == 1158 || in == 1250 || in == 1110 || in == 1643 )
	{
		
		
		
		if (in == 1157)
		{
			iin = "Electromagnetic Wave";
			System.out.println("Issue successful! you have issued book: "+ iin );
			if(LibMan.amt[0]!=0)
			{
			LibMan.amt[0]=LibMan.amt[0]-1;
			System.out.println("Remaining Books "+LibMan.amt[0]);
			}
			else
				System.out.println("Book  not available");
				
		}
		
		
		
		
		
		else if (in == 1158)
		{
			iin = "Engineering Mathematics";
			System.out.println("Issue successful! you have issued book: "+ iin );
			if(LibMan.amt[1]!=0)
			{
			LibMan.amt[1]=LibMan.amt[1]-1;
			System.out.println("Remaining Books "+LibMan.amt[1]);
			}
			else
				System.out.println("Book  not available");
		}
		
		
		
		
		
		else if (in ==1250 )
		{
			iin = "Electronic Devices and Circuits";
			System.out.println("Issue successful! you have issued book: "+ iin );
			if(LibMan.amt[0]!=0)
			{
			LibMan.amt[2]=LibMan.amt[2]-1;
			System.out.println("Remaining Books "+LibMan.amt[2]);
			}
			else
				System.out.println("Book  not available");
		}
		
		
		
		
		
		else if ( in == 1110) 
		{
			iin = "Digital Circuits";
			System.out.println("Issue successful! you have issued book: "+ iin );
			if(LibMan.amt[0]!=0)
			{
			LibMan.amt[3]=LibMan.amt[3]-1;
			System.out.println("Remaining Books "+LibMan.amt[3]);
			}
			else
				System.out.println("Book  not available");
		}
		
		
		else if (in == 1643) 
		{
			iin = "Circuit Theory";
			System.out.println("Issue successful! you have issued book: "+ iin );
			if(LibMan.amt[0]!=0)
			{
			LibMan.amt[4]=LibMan.amt[4]-1;
			System.out.println("Remaining Books "+LibMan.amt[4]);
			}
			else
				System.out.println("Book  not available");
		}
		
		
	}
	
	
	else 
	{
		System.out.println("Book not found in the database please try again! ");
		in = asc.nextInt();
	}
	
	
	
		
	}
	
	
}


