package FPAssignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static EventMenu eventMenu = new EventMenu();
    static MainMenu mainMenu = new MainMenu();
    static BookEventMenu bookEventMenu = new BookEventMenu();
    static ViewBookingsMenu viewBookingsMenu = new ViewBookingsMenu();
    static MenuState currentMenu;
    static public ArrayList<Event> eventHolder = new ArrayList<>();
    static public ArrayList<Tuple> eventTicketQuanities = new ArrayList<>();

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        PopulateEvents();
        PopulateMainMenu();
       currentMenu = mainMenu;
        
        
        System.out.println("Welcome to Super Event!");
        
       while (true) { 
            currentMenu.PrintMenuOptions();
            if(!(currentMenu.getClass().isInstance(bookEventMenu))){
                System.out.println("Select option: ");
                //System.out.println(currentMenu.getClass());
                //System.out.println(currentMenu.options.size());
                String selectedOption = s.nextLine();
           
                while(!Utility.isValidOption(selectedOption, currentMenu)){
                    System.out.println("Invalid Option, please try again");
                    selectedOption =  s.nextLine();
                }
                int optionAsInt = Integer.parseInt(selectedOption);
                currentMenu.options.get(optionAsInt - 1).OnSelect();
                
                //System.out.println(currentMenu.options.size());
                //System.out.println("Option " + optionAsInt + "selected:" + currentMenu.options.get(optionAsInt - 1).GetNameInMenu());
            }else if(currentMenu instanceof BookEventMenu bookEventMenu){
                
                System.out.println("Enter a keyword: ");
                String keyword = s.nextLine();
                for (Event event : eventHolder) {
                    if(event.getName().toLowerCase().contains(keyword.toLowerCase())){
                        bookEventMenu.AddEventOption(event);
                    }

                }
                EventMenu filteredEventMenu = new EventMenu();
                filteredEventMenu.options = bookEventMenu.options;
                currentMenu  = filteredEventMenu;
                currentMenu.PrintMenuOptions();
                String selectedOption = s.nextLine();
                while(!Utility.isValidOption(selectedOption, currentMenu)){
                    System.out.println("Invalid Option, please try again");
                    selectedOption =  s.nextLine();
                }
                int optionAsInt = Integer.parseInt(selectedOption);
                currentMenu.options.get(optionAsInt - 1).OnSelect();
                
            }
           
            
       }
        
       
    }
    static void PopulateEvents(){
        Event JazzNight= new Event("Jazz Night with Joe", 10.50, 3, true);
        Event YoutubeRock = new Event("Youtube Rock Concert", 25.25, 0, true);
        Event MozartChamber = new Event("Mozart Chamber Music", 50, 2, false);
        Event HarryPotter = new Event("Harry Potter Concert", 100.00, 6, false);
        eventHolder.add(JazzNight);
        eventHolder.add(YoutubeRock);
        eventHolder.add(MozartChamber);
        eventHolder.add(HarryPotter);

        eventMenu.AddEventOption(JazzNight);
        eventMenu.AddEventOption(YoutubeRock);
        eventMenu.AddEventOption(MozartChamber);
        eventMenu.AddEventOption(HarryPotter);
    }
    
    static void PopulateMainMenu(){
        mainMenu.AddMenuOption(eventMenu, "List all events");
        mainMenu.AddMenuOption(bookEventMenu, "Book tickets");
        mainMenu.AddMenuOption(viewBookingsMenu, "View Bookings");
    }
    public static void ChangeMenuState(MenuState newMenu){
        currentMenu = newMenu;
    }

}
