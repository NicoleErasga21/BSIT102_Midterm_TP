import java.io.IOException;
import java.io.FileWriter;  
import java.util.Scanner;
public class FinNicoleErasga
 {  
    public static void main(String args[]) throws IOException
    {    
    	// Construct new Scanner
    	Scanner nicoleScanner = new Scanner(System.in);
    	String FileText;
    	String nicoleText;
       	
    	// User Input 
    	System.out.println("Input File Text");
    	FileText= nicoleScanner.nextLine();
    	System.out.println("Input File Name");
    	nicoleText = nicoleScanner.nextLine();
    	
    	//Creates New File
        FileWriter nicoleFile = new FileWriter("D:\\NicoleErasga\\"+nicoleText+".NE");    
        nicoleFile.write(FileText);    
        nicoleFile.close();            	  
          
     }    
     	
}  