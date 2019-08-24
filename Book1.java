package Common;




public class Book1{
    
 
	
	public int []  Id= {1157,1158,1250,1110,1643};
	public String [] book_name= {"Electromagnetic waves","Engineering Mathematics","Electronic Devices and Circuits","Digital Circuits","Circuit Theory"};
	public String[] author= {"Shevgaonkar","HK Das","Boylestad","RP Jain","Ravish Singh"};
	public int amt[]= {10,15,18,13,21};
    
	
	
  
    
    public void show(int i)
    {
            System.out.format(" %-15s%-36s%-16s%10s",Id[i],book_name[i],author[i],amt[i]+"\n"); //books
    }
  
	
  public static void display()
          {      
        String bk_uniqueid="Unique Id";
	    String bk_name="Book Name";
        String bk_author="Author";
        String bk_quantity="Quantity";
        //System.out.format("%30s"+"");  //print spaces
        System.out.println("Available Books"); //title
        System.out.format(" %-15s%-36s%-16s%-10s ",bk_uniqueid,bk_name,bk_author,bk_quantity+"\n\n"); //headings
        
        Book1 b=new Book1();
               
		
		
        for(int i=0;i<5;i++) {
		
        	b.show(i);
        }
            }
	
}
	


