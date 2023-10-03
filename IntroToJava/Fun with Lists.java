/**
 *   A program that reads Strings from two files into Lists, then displays a
 *   "merged" list constructed from them in two different ways.
 *
 * @author Gabe Azzarita
 * @version 20221120
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;  

public class ListPractice {
    
    public static List<String> getList(String wordsFile) throws IOException {
        Scanner lineReader = null;
        ArrayList<String> fileList = new ArrayList<String>();
        try {
            int i = 0;
            lineReader = new Scanner (new File(wordsFile));
            while (lineReader.hasNext()) {
                fileList.add(lineReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println ("ERROR! File " + wordsFile + " not found!");
        } finally {
            lineReader.close();
        }
        return fileList;
    }

    private static void displayList(List<String> myList) {
        int j = 0;
        for (j = 0; j < myList.size(); j++) {
            System.out.println (j + ": " + myList.get(j));
        }

    }

    // Changed this to directly print out to the console instead of returning an arrayList
    private static void mergeLists(List<String> list1, List<String> list2) {
        int k = 0;
        int h = 0;
        if (list1.size() < list2.size()) {
            for (k = 0; k < list1.size(); k++) {
                System.out.println (2*k + ": " + list1.get(k));
                System.out.println ((2*k+1) + ": " + list2.get(k));
            }
            for (h = k; h < list2.size(); h++) {
                System.out.println (2*h + ": " + list2.get(h));
            }
        } else if (list2.size() < list1.size()) {
            for (k = 0; k < list2.size(); k++) {
                System.out.println (2*k + ": " + list1.get(k));
                System.out.println ((2*k+1) + ": " + list2.get(k));
            }
            for (h = k; h < list1.size(); h++) {
                System.out.println (2*h + ": " + list1.get(h));
            }            
        } else {
            for (k = 0; k < list1.size(); k++) {
                System.out.println (2*k + ": " + list1.get(k));
                System.out.println ((2*k+1) + ": " + list2.get(k));
            }            
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fname = keyboard.nextLine();
        List<String> list1 = getList(fname);
        System.out.print("Enter another: ");
        fname = keyboard.nextLine();
        List<String> list2 = getList(fname);

        System.out.println("Wordlist 1");
        System.out.println("----------");
        displayList(list1);

        System.out.println();
        System.out.println("Wordlist 2");
        System.out.println("----------");
        displayList(list2);
        
        System.out.println ();
        System.out.println ("List 1 merged with List 2");
        System.out.println ("-------------------------");
        mergeLists (list1, list2);
        
        System.out.println ();
        System.out.println ("List 2 merged with List 1");
        System.out.println ("-------------------------");
        mergeLists (list2, list1);

        keyboard.close();
    }

}
