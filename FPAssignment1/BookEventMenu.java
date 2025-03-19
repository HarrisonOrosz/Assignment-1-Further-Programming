package FPAssignment1;

public class BookEventMenu extends MenuState{
    @Override
    public void PrintMenuOptions(){

        for (int i = 0; i < options.size(); i++) {
            int optionCounter = i + 1;
            System.out.println(optionCounter + ". " + options.get(i).GetNameInMenu());
        }
       
    }
    public void AddEventOption(Event event){
        EventOption eventAsOption = new EventOption(event, event.getName() + " | $" + event.getPrice() + " | " + event.getSeats() + " seats | ");
        options.add(eventAsOption);
    }
}
