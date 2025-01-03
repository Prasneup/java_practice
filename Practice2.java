import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))
       {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
        }catch(Exception ex){
            System.out.println("Write only numbers");
        }finally{
            System.out.println("Success");
        }
    }
    
}
