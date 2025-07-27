import java.util.Scanner;

public class PoissonDistribution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter arrival rate per hour: ");
        double num = s.nextDouble(); // L = average arrival rate
        
        for (int x = 0; x < 16; x++) {
            int fact_x = 1;
            for (int i = 1; i <= x; i++) {
                fact_x *= i;
            }
            
            double pr = (Math.pow(2.71, -num) * Math.pow(num, x)) / fact_x;
            System.out.println("P(X = " + x + ") = " + pr);
        }
        
        s.close();
    }
}
