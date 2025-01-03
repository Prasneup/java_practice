import java.io.File;
public class CreateTextFile{
    public static void main(String[] args) {
        try{
            File f = new File("myNewFile.txt");
            if(f.createNewFile()){
                System.out.println("File has been created");
            }else{
                System.out.println("Already there");
            }

        }catch(Exception ex){
            System.out.println("Error,Error,Error!!!");
        }
        
    }
}
