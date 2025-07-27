import java.io.File;
public class CreateFile2 {
    public static void main(String[] args) {
     try{
        File f = new File("whatsup.txt");
        if(f.createNewFile()){
            System.out.println("File has been created");
        }else{
            System.out.println("Already exists");
        }
     }catch(Exception e){
        System.out.println("Invalid!");
     }
    }
    
}
