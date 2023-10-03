/**
 * A class that implements a very simplified StringBuilder-like class.  This
 * class will not execute on its own - you will need to use code provided in
 * the TestSimpleStringBuilder.java class to run this code.
 *
 * @author Gabe Azzarita
 * @author ENTER YOUR PARTNER'S NAME HERE
 * @version 20221127
 *
 */
import java.util.ArrayList;
import java.util.List;

public class SimpleStringBuilder {

    List<Character> list;

    private void createEmptyBuilder() {
        this.list = new ArrayList<>();
    }

    public SimpleStringBuilder() {
        this.createEmptyBuilder();
    }

    public SimpleStringBuilder(String input) {
        this.createEmptyBuilder();

        for (int i = 0; i < input.length(); i++) {
            this.list.add(input.charAt(i));
        }
    }

    public String toString() {

        String myString = "";
        for (int i = 0; i < this.list.size(); i++) {
            myString = myString + this.list.get(i);
        }
        return myString;
    }

   public char charAt(int i) {
      return this.list.get(i);
   }

   public int length() {
      return this.list.size();
   }

    public void replaceCharAt(int i, char c) {
        this.list.set(i, c);
    }

   public void append(char c) {
      this.list.add(c);
   }

   public void insert(int i, char c) {
      this.list.add(i, c);
   }

   public void deleteCharAt(int i) {
      this.list.remove(i);
   }
}