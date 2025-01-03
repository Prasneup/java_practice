import java.util.Scanner;
public class User {
    public static void main(String[] args) {

        try(Scanner demo = new Scanner(System.in)){;
        System.out.println("Enter the first number");
        int num1 = demo.nextInt();
        System.out.println("Enter second number");
        int num2 = demo.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is " +sum);
    }catch(Exception ex){
        System.out.println("Please enter number ");
    }
        
    }
    
}
