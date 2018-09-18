

public class Pair
{
    private int row, column, value;

    /**
     * Default constructor for objects of class pair
     */
    public Pair(int row, int column)
    {
        this.row = row; 
        this.column = column; 
        this.value = 0; 
    }

    public int getRow()
    {
        // put your code here
        return row;
    }
    
    public int getColumn()
    {
        return column; 
    }
    
    public int getValue()
    {
        return value; 
    }
    
    public void setValue(int newValue)
    {
        value = newValue;
    }
    
    public void setRow(int newRow) 
    {
        row = newRow;
    }
    
    public void setColumn(int newColumn) 
    {
        column = newColumn;
    }

}
