import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: shridhad
 * Date: 7/12/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class BangloreLibrary {

    private ArrayList<String> menuList;
    
    @Override
    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(other == this)
            return true;
        if(getClass() == ((BangloreLibrary)other).getClass()){
            return true;
        }
        return false;
    }

    public String welcomeUser() {
        String outputString = new String("Welcome");
        System.out.print(outputString);
        return outputString;
    }

    public String menuOptions() {
        String []menu = {"View All Books",
                            "Reserve Book",
                            "Return Book",
                            "Show Library Number"};

        menuList = new ArrayList<String>(Arrays.asList(menu));
        String outputString = new String();

        outputString = "Menu: ";
        for(int i=0; i<menuList.size(); i++){
            outputString = outputString + "\n" + (i+1) +". " + menuList.get(i);
        }
        outputString = outputString + "\n Enter your choice:";
        System.out.print(outputString);
        return outputString;
    }

    public boolean checkValidMenu(int menuIndex) {
       if(menuIndex < 0 || menuIndex > 4)
           return  false;
        return true;
    }
}
