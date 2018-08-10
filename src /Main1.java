import Menu.Menu;

public class Main1 {
    static boolean var = false;
    public static void main(String[] args)
    {
        Menu menu = new Menu();
        while(!var) menu.displayMenu();
    }
}
