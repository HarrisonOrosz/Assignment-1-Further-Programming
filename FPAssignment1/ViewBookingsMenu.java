package FPAssignment1;
public class ViewBookingsMenu extends MenuState{
    @Override
    public void PrintMenuOptions(){

        for (int i = 0; i < options.size(); i++) {
            int optionCounter = i + 1;
            System.out.println(optionCounter + ". " + options.get(i).GetNameInMenu());
        }
       
    }
    public void AddCheckoutItem(Tuple<Event, Integer> bookedTickets){
        MenuTransitionOption newOption = new MenuTransitionOption(Main.currentMenu, bookedTickets.x.getName() + " X " + bookedTickets.y + " " + bookedTickets.x.onlineOrNot() + " : " + bookedTickets.x.getPrice() * bookedTickets.y);
        options.add(newOption);
    }
}