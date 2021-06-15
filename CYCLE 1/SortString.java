import java.util.Arrays;
import java.util.Scanner;
public class SortString{
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a string : ");
      String str = s.nextLine();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}