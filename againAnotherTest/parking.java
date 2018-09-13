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
        Stack <Integer> street = new Stack<>(); 
        Stack<Integer> driveway = new Stack<>(); 
        
        System.out.println("What car do you want to add/remove?"); 
        Integer car = in.nextInt();
        while (car != 0)
        {
            if (car < 0) //removing car 
            {
               while(driveway.peek().intValue() != Math.abs(car.intValue()))//found the car you wanna remove
               {
                   street.push(driveway.pop());
               }
               //when the car is found 
               driveway.pop();
               while (street.empty() == false)
               {
                   driveway.push(street.pop());
                }
            }
            else //adding car 
            {
                driveway.push(car); 
            }
            System.out.println("On the Street: " + street); 
            System.out.println("On the Driveway: " + driveway);
            
            System.out.println("What car do you want to add/remove?"); 
            car = in.nextInt();
        }
       
        
    }
}
