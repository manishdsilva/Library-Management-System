package Common;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Password{
	
	 
	
public void code()
{
	 try
	    {			
		LibMan.restart=1;
	
	while(LibMan.restart==1)
	{        
     
     Scanner read=new Scanner(System.in);
		System.out.println("\tUsername Please");
		LibMan.a=read.nextLine();
	    LibMan.count=0;	
		if((LibMan.a.equals("Manish"))||(LibMan.a.equals("Kimaya"))||(LibMan.a.equals("Aditya")))
	      {        	
		  while(LibMan.count!=-1)
		    {
			   System.out.println("\n\n\tEnter Password");
			   LibMan.password=read.nextInt();
			   
			   Check ck = new Check(LibMan.password);	
			  
	        }
	      }
		else
		   {
			System.out.println("\n\n\tIncorrect Username\nTry Again");
			LibMan.restart=1;
		   }	
	  }
	
   	}
		catch (InputMismatchException e)
	      {
           System.out.print("\n\n\tInputMismatchException"); 
       }
}
	
}
