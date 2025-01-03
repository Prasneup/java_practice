import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        try{
        File f = new File("myFile.txt");
        if(f.delete()){
            System.out.println("File is deleted.");
        }else{
            System.out.println("File not availabe!!!!");
        }
        }catch (Exception ex){
            System.out.println("Something went wrong.");

        }

    }
    
}
