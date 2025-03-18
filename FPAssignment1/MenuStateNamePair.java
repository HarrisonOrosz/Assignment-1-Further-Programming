package FPAssignment1;
public class MenuStateNamePair{
    private String menuName;
    public MenuState menu;
    public MenuStateNamePair(String name, MenuState menu){
        this.menuName = name;
        this.menu = menu;
    }

    public String GetMenuName(){
        return menuName;
    }
    public void OnSelect(){
        
    }
}