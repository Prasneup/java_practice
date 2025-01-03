public class ParameterandReturn3 {
    //Parameter and Return value....
    public static void main(String[] args) {
        String fname = "Prasanna";
        String lname = "Neupane";
        String FullName = myFullName(fname, lname);
        System.out.println(FullName);

        double p = 10000;
        double t = 2;
        double r = 7;
        double SI = findSI(p, t, r);
        System.out.println(SI);
        
    }
    
    public static String myFullName(String fname, String lname){
        return "Full Name is: "+fname+ " "+lname;
    }

    public static double findSI(double p, double t, double r){
        double findSI = (p * t * r)/100;
        return findSI;
    }
}
