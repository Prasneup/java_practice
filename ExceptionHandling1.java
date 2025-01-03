import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){;
        
        System.out.println("Enter First number= ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number= ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
        }catch(Exception ex){
            System.out.println("Please number only.");
        }finally{
            System.out.println("Success!!!");
        }
    }
    
}
