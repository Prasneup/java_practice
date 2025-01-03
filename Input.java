//Get Input From User
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){;
            System.out.println("Enter fname of the person");
            String fname = input.nextLine();
            System.out.println("Enter lname of the person");
            String lname = input.nextLine();
    
    
            System.out.println("The name of person is " +fname+ " "+lname);
        
        
     }catch(Exception ex){
        System.out.println("Please the enter the name of person");
     }
  }

}
