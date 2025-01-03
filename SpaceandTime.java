public class SpaceandTime {
    public static void main(String[] args) {
        SpaceandTime demo = new SpaceandTime(); // Instance of the class
        demo.printNumbers(3); // Call the instance method
    }

    public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("End of the inner loop");
        }
        System.out.println("End of the outer loop");
    }
}

