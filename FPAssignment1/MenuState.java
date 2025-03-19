package FPAssignment1;
import java.util.ArrayList;
public abstract class MenuState {
    String menuTitle;
    ArrayList<SelectableOption> options = new ArrayList<>();
    
    
  
    public String GetMenuTitle(){
        return menuTitle;
    }
    
    public void PrintMenuOptions(){
        System.out.println(menuTitle);
        for (int i = 0; i < options.size(); i++) {
            
            int menuNumber = i + 1;
            System.out.println(menuNumber + ". " + options.get(i).GetNameInMenu());
        }
       
    }
    public  void AddMenuOption(){
        
    }
    
}
