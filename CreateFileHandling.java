import java.io.File;
public class CreateFileHandling {
    public static void main(String[] args) {
        try{
        File f = new File("myFile.txt");
        if(f.createNewFile()){
            System.out.println("File is created.");
        }else{
            System.out.println("Error!!!!");
        }
        }catch (Exception ex){
            System.out.println("Something went wrong.");

        }

    }

    
}
