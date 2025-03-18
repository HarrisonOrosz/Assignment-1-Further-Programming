package FPAssignment1;
import java.util.ArrayList;
public abstract class MenuState {
    String menuTitle;
    ArrayList<MenuStateNamePair> menuOptions = new ArrayList<>();
    int numOptions;
    
  
    public String GetMenuTitle(){
        return menuTitle;
    }
    
    public void PrintMenuOptions(){
        System.out.println(menuTitle);
        for (int i = 0; i < menuOptions.size(); i++) {
            
            int menuNumber = i + 1;
            System.out.println(menuNumber + ". " + menuOptions.get(i).GetMenuName());
        }
       
    }
    public void AddMenuOption(){
        MenuStateNamePair newMenuOption = new MenuStateNamePair();
        menuOptions.
    }
    
}
