import java.util.Stack;

/**
 * Write a description of class FloodFill here.
 * 
 * page number 716 e15.22
 */
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
       int count = 1; 
       Pair coordinate = new Pair(row,column); 
       Stack <Pair> coordinates = new Stack<Pair>();
       coordinates.push(coordinate);
       while (count <=100) 
       {
           Pair compare = coordinates.pop();
           
       }

   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }


}
