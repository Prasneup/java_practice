import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        try{
        File f = new File("hello.txt");
        if(f.createNewFile()){
            System.out.println("File is created");
        }else{
            System.out.println("Alreday exists");
         }
       }catch(Exception e){
        System.out.println("Somethings error!");
       }
    } 
}
