package FPAssignment1;
public class MenuTransitionOption implements SelectableOption{
    MenuState newMenu;
    String nameInMenu;
    
    public MenuTransitionOption(MenuState newMenu, String nameInMenu){
        this.newMenu = newMenu;
        this.nameInMenu = nameInMenu;
    }
    @Override
    public void OnSelect(){
        Main.ChangeMenuState(newMenu);
    }

    @Override
    public String GetNameInMenu() {
       return nameInMenu;
    }
    
}
