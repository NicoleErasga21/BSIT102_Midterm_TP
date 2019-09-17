import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class foutNicoleErasga
{
    public static void main(String[] args) throws IOException
    {
    		// Constructs New Scanner
            System.out.print("Enter the file name with extension : ");
            Scanner nicsInput = new Scanner(System.in);
            
            // Read file with existing folder and extension
            File nicsFile = new File("D:\\NicoleErasga\\"+nicsInput.nextLine()+".NE");
            nicsInput = new Scanner(nicsFile);
                       
            // Print the output
            String nicsLine = nicsInput.nextLine();
            System.out.println(nicsLine);
           
           	// close the file writer
            nicsInput.close();     
    }
}