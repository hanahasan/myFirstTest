
import java.util.Scanner; 
import java.util.Set; 
import java.util.TreeSet;
import java.io.*;
/**
 * Write a description of class TreeSet here.
 * 
 * pg #715 E15.12
 */
public class UniqueWords
{
    public static void main (String[] args)
    {
        
        try (Scanner scan = new Scanner(new File("ObamaSpeech.txt"));)
        {
           Set <String> uniqueWords = new TreeSet<>();
           while (scan.hasNext())
           {
              // String word = clean(scan.next());
               //System.out.println(word);
               uniqueWords.add(clean(scan.next())); 
           }
           for (String word: uniqueWords)
           {
               System.out.println(word);
            }
           
        }
        catch (FileNotFoundException e){}
    }
    
   public static String clean(String s)
   {
      String r = "";
      for (int i = 0; i < s.length(); i++)
      {
         char c = s.charAt(i);
         if (Character.isLetter(c))
         {
            r = r + c;
         }
      }
      return r.toLowerCase();
   }

}
