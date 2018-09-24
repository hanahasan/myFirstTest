import java.util.Queue; 
import java.util.LinkedList;

/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   private Queue<String> landing, takeOff;

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
       landing = new LinkedList<String>();
       takeOff = new LinkedList<String>();
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
       takeOff.add(flightSymbol);
       System.out.println(flightSymbol + " is waiting for takeoff");
   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      landing.add(flightSymbol);
      System.out.println(flightSymbol + " is waiting for landing");
   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
       if (landing.peek() != null) 
       {
           System.out.println(landing.remove() + " has just landed");
        }
       else if (landing.peek() != null)
       {
           System.out.println(takeOff.remove() + " just took off");
        }
       else 
       {
           System.out.println("No planes here!");
        }
   }
}
