public class SwapNumber {
    public static void main(String[] args) {
     int num1 = 29;
     int num2 = 21;

     System.out.println("Before swap");
     System.out.println("num1 = "+num1);
     System.out.println("num2 = "+num2);

     int temp = num1;
     num1 = num2;
     num2 = temp;

     System.out.println("After swap");
     System.out.println("num1 = "+num1);
     System.out.println("num2 = "+num2);


    }
    
}
