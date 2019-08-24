package Common;


import java.util.concurrent.TimeUnit;
public class Check{
	
	
	
public Check(int pass) {
	if((((LibMan.a.equals("Manish"))&&pass==28091999)||((LibMan.a.equals("Kimaya"))&&pass==16022000)||
			((LibMan.a.equals("Aditya")&&pass==25121999))))
		{
				System.out.println("\n\n\t Login Successful \n\n\t\t\t\tWelcome "+LibMan.a+" !"); 
				
			    Screen s= new Screen();						       
		}
	
	else if(LibMan.count<3)
	{
		System.out.println("\n\n\tIncorrect Password Try Again");
		LibMan.restart=0;
		LibMan.count=LibMan.count+1;
	}
	
	else
	{ 
	 try
	 {
	  System.out.println("\n\n\tPassword Entered incorrectly "+(LibMan.count+1)+ " Times\n\n\tWait for 20 seconds");		      			  
	  TimeUnit.SECONDS.sleep(20);
	  
		  System.out.println("\n\n\tEnter everything again");
		  LibMan.restart=1;
		  LibMan.count=-1;
	  
	  	  
	   }
	  catch(InterruptedException e) { 
	  Thread.currentThread().interrupt(); 
   	}
	}

  }
}