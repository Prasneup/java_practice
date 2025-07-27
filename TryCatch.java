import java.util.Scanner;
public class TryCatch {
    public static void main(String[]args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;

            System.out.println("The sum is: "+sum);
        }catch(Exception e){
            System.out.println("Enter the valid number");
        }finally{
            System.out.println("Finally success");
        }
    }
    
}
