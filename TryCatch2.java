import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first name: ");
            String fname = sc.nextLine();
            if (!fname.matches("[a-zA-Z]+")) {
                throw new Exception("Invalid input! Only letters are allowed.");
            }
            
            System.out.print("Enter the second name: ");
            String lname = sc.nextLine();
            if (!lname.matches("[a-zA-Z]+")) {
                throw new Exception("Invalid input! Only letters are allowed.");
            }

            System.out.println("The full name is: " + fname + " " + lname);
        } catch (Exception e) {
            System.out.println("Enter the letters only, stupid!");
        } finally {
            System.out.println("Finally you got what I said.");
        }

        sc.close();
    }
}

