package FPAssignment1;
public class MainMenu extends MenuState{
    @Override
    public void PrintMenuOptions(){
        for (int i = 0; i < options.size(); i++) {
            int optionCounter = i + 1;
            System.out.println(optionCounter + ". " + options.get(i).GetNameInMenu());
        }
    }
    public void AddMenuOption(MenuState menu, String nameInMenu){
        MenuTransitionOption newMenuTransition = new MenuTransitionOption(menu, nameInMenu);
        options.add(newMenuTransition);
        
    }
}
