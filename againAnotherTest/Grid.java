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
       Pair northCord, southCord, eastCord, westCord;
       while (count <=100) 
       {
           Pair compare = coordinates.pop();
           if (compare.getValue() == 0)//not been filled
           {
               compare.setValue(count);
               pixels [compare.getRow()][compare.getColumn()] = compare.getValue();
               count++;
               coordinates.push(compare);//pushing the center coordinate
               //checking the north coordinate
               northCord = new Pair(row+1, column); 
               if (pixels [northCord.getRow()][northCord.getColumn()] == 0) //empty
               {
                   northCord.setValue(count); 
                   pixels [northCord.getRow()][northCord.getColumn()] = northCord.getValue();
                   count++;
                   coordinates.push(northCord); 
                }
               //checking east coordinate 
               eastCord = new Pair(row, column+1);
               if (pixels [eastCord.getRow()][eastCord.getColumn()] == 0)
               {
                   eastCord.setValue(count); 
                   pixels [eastCord.getRow()][eastCord.getColumn()] = eastCord.getValue();
                   count++; 
                   coordinates.push(eastCord); 
                }
               //checking south coordinate 
               southCord = new Pair(row-1, column);
               if (pixels [southCord.getRow()][southCord.getColumn()] == 0)
               {
                   southCord.setValue(count); 
                   pixels [southCord.getRow()][southCord.getColumn()] = southCord.getValue();
                   count++; 
                   coordinates.push(southCord); 
                }
               //checking east coordinate 
               westCord = new Pair(row, column-1);
               if (pixels [westCord.getRow()][westCord.getColumn()] == 0)
               {
                   westCord.setValue(count); 
                   pixels [westCord.getRow()][westCord.getColumn()] = westCord.getValue();
                   count++; 
                   coordinates.push(westCord); 
                }
               //reseting the row and column values 
               row = coordinates.peek().getRow(); 
               column = coordinates.peek().getColumn();
            }
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
