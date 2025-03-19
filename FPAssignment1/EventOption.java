package FPAssignment1;
public class EventOption implements SelectableOption{
    private Event event;
    private String nameInMenu;
    
    public EventOption(Event event, String nameInMenu){
        this.event = event;
        this.nameInMenu = nameInMenu;
    }
    @Override
    public void OnSelect() {
       event.PurchaseTickets();
    }

    @Override
    public String GetNameInMenu() {
       return nameInMenu;
    }
    
}
