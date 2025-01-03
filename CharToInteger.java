public class CharToInteger{
    public static void main(String[] args) {
        
        char ch = '9';

        System.out.println("char value: "+ch);

        int num = Integer.parseInt(String.valueOf(ch));

        System.out.println("Int value: "+num);
    }
}