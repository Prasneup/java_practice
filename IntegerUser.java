import java.util.Scanner;
public class IntegerUser {
    public static void main(String[] args) {

    try(Scanner sc = new Scanner(System.in))

    {System.out.println("Enter any number");
    int num = sc.nextInt();

    System.out.println("The number is: "+num);
        
    }catch(Exception ex){
        System.out.println("Please enter valid number");
    }

    }
    
}
