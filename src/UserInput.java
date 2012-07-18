import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Shridhar Deshmukh
 * Date: 7/17/12
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */

/* Responsibility : To Read input from user */
public class UserInput {
    
    Scanner scanner;

    public UserInput(){
        scanner = new Scanner(System.in);
    }

    public String askBookName(){
        System.out.print("\nEnter Book Name:");
        return scanner.nextLine();
    }

    public int askChoice(){
        System.out.print("\nEnter your choice:");
        int choice = 0;
        while(true){
            try{
                choice = Integer.parseInt(scanner.nextLine());
                return choice;
            }
            catch (NumberFormatException numberFormatException){
                System.out.print("\nSorry! Wrong Choice. Enter Again:");
            }
        }
    }

    public String askCustomerName() {
        System.out.print("\nEnter Customer Name:");
        return scanner.nextLine();
    }
}
