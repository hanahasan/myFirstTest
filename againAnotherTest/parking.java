import java.util.Scanner; 
import java.util.*;
/**
 * Write a description of class parking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * activity 15.10 on pg 715
 */
public class parking
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack street = new Stack(); 
        Stack driveway = new Stack(); 
        
        Integer car = 1;
        while (car != 0)
        {
            System.out.println("What car do you want to add/remove?"); 
            car = in.nextInt();
        
            if (car < 0) //removing car 
            
               if (driveway.peek().intValue() == Math.abs(car.intValue()))//found the car you wanna remove
               {
                   driveway.pop();
                   while (street.empty() == false)//emptying street into driveway
                   {
                       driveway.push(street.pop());
                    }
                }
               else
               {
                   street.push(driveway.pop());
                }
            
            else //adding car 
            {
                driveway.push(car); 
            }
            System.out.println("On the Street: " + street); 
            System.out.println("On the Driveway: " + driveway);
        }
       
        
    }
}
