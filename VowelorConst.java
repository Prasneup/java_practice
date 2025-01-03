import java.util.Scanner;
public class VowelorConst {
    public static void main(String[] args) {
        //Write a program to check whether a character is vowel or consonant
        try(Scanner sc = new Scanner(System.in))
        {
        System.out.println("Enter the character: ");
        Character Char = sc.next().charAt(0);
        if (Char=='a' || Char=='e' || Char=='i' || Char=='o' || Char=='u'){
            System.out.println("Its a vowel letter.");

        }else{
            System.out.println("Its a consonant letter.");
        }
    }catch(Exception ex){
        System.out.println("Please enter validate character");
    }

        
    }
    
}
