import java.io.File;
public class DeleteFile2 {
    public static void main(String[] args) {
        try{
            File f = new File("hello.txt");
         if(f.delete()){
            System.out.println("file is deleted");
             }  else{
                System.out.println("Alreday deleted");
             }  
            }catch(Exception e){
                System.out.println("Invalid");
            }
    }

}
