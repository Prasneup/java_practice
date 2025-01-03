import java.util.Scanner;
public class StringName {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in))
       {
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("MY NAME IS: "+name);

       }catch(Exception ex){
        System.out.println("Please enter a valid String");
       }
    }
    
}
