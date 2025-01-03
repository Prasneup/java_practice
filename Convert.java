//write a program to convert string to integer...
public class Convert {
    public static void main(String[] args) {
        String i = "123";

        int j;
        System.out.println("---way 1---");
        j = Integer.valueOf(i);
        System.out.println(j);

        System.out.println("---way 2---");
         String y = "1234";
         int z;
        z = Integer.parseInt(y);
        System.out.println(z);


        System.out.println("---way 3---");
        String u = "2468";
        int v;
        v=Integer.valueOf(u).intValue();
        System.out.println(v);
    }
    
}
