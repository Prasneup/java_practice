import java.io.*;
public class File1 {
    public static void main(String[] args) {
        File file = new File("whatsup.txt");
        if(file.exists()){
            System.out.println("The file exists>>>)");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
            
        }
        else{
            System.out.println("That file doesn't exsits(");
        }
    }
    
}
