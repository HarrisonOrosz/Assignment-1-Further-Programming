package FPAssignment1;
import java.util.ArrayList;
public class EventMenu extends MenuState{
    ArrayList<Event> events =  new ArrayList<>();
    @Override
    public void PrintMenuOptions(){
        if(events == null || events.size() <= 0){
            System.out.println("There are no events available");
            return;
        }
        for (int i = 0; i < events.size(); i++) {
            Event currentEvent = events.get(i);
            int currentMenuNumber = i + 1;
            String outputString = currentMenuNumber + ". " + currentEvent.getName() + " | $" + currentEvent.getPrice() + " | " + currentEvent.getSeats() + " seats | ";
            if(currentEvent.onlineOrNot()){
                outputString = outputString.concat("Online available");
            }else{
                outputString =outputString.concat("Not online");
            }
            System.out.println(outputString);
        }
    }
    public void AddEvent(String eventName, double price, int availableSeats, boolean online){
        Event newEvent = new Event(eventName, price, availableSeats, online);
        events.add(newEvent);
    }
}
