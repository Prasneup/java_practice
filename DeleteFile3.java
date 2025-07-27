import java.io.File;
public class DeleteFile3 {
    public static void main(String[] args) {
        try{
            File f = new File("whatsup.txt");
            if(f.delete()){
                System.out.println("File deleted");
            }else{
                System.out.println("No file");
            }
        }catch(Exception e){
            System.out.println("Invalid");
        }
    }
}
