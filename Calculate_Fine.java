package Common;
import java.util.*;




public class Calculate_Fine{
static int diff  , fine ;
public  static int calculate_fine() 
{
 
 System.out.println("Enter Days After which book is Returned");
 Scanner sc=new Scanner(System.in);
  int diff=sc.nextInt();
 
  if(diff<=7)
  {
      fine=0;
              System.out.println("your fine ="+fine);
  
  }
  else if(diff>7)
  {
   fine = 5*(diff-7);
  System.out.println("your fine ="+fine);
  }
  return fine;
}

}



