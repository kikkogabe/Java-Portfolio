/**
 * Program to copy one file into another, using command line arguments
 *
 * @author Gabe Azzarita
 *
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.util.Scanner;

public class FunWithFiles {
   
   /**
    * Displays the file given by fname to the screen
    * 
    * @param fname file to be displayed
    */
   public static void displayFile(String fname) {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null; 
        try {
            fileByteStream = new FileInputStream(fname);
            inFS = new Scanner (fileByteStream);
            while (inFS.hasNext()) {
                System.out.println (inFS.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println ("ERROR - File " + fname + " not found!");
        }
    }
   
    public static void main(String[] args) {
        String fname;
        Scanner scnr = new Scanner(System.in);
        System.out.print ("Enter a filename: ");
        fname = scnr.next();
        displayFile(fname);  
        scnr.close();
    }
}
