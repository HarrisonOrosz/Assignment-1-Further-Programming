package FPAssignment1;
import java.util.Scanner;

public class Main {
    static EventMenu eventMenu = new EventMenu();

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       
  
        
        System.out.println("Welcome to Super Event!");
        eventMenu.PrintMenuOptions();
        PopulateEvents();
        eventMenu.PrintMenuOptions();
        System.out.println("Please select: ");
        String input = s.nextLine();
        while(!(Utility.isNumerical(input) && Integer.parseInt(input) > 0 && Integer.parseInt(input) <= eventMenu.events.size())){

        }
        Event selectedEvent = eventMenu.events.get(Integer.parseInt(input) -1);
        System.out.println(selectedEvent.getName());
        selectedEvent.PurchaseTickets();
        eventMenu.PrintMenuOptions();
        
    }
    static void PopulateEvents(){
        eventMenu.AddEvent("Jazz Night with Joe", 10.50, 3, true);
        eventMenu.AddEvent("Youtube Rock Concert", 25.25, 0, true);
        eventMenu.AddEvent("Harry Potter Concert", 100.00, 0, true);
        eventMenu.AddEvent("Fortnite battle pass", 12.00, 4, false);
    }

}
