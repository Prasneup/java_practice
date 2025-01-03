import java.util.Scanner;
public class OddorEven {
    //write a program to check whether if the number is odd or even
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Its even");
        }else{
            System.out.println("Its odd");
        }
    }catch(Exception ex){
        System.out.println("valid number only");
    }
    }
    
}
