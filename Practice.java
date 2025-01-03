import java.io.File;
public class Practice {
    public static void main(String[] args) {
        try{
            File f = new File("myanotherFile.txt");
            if(f.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("Already there delete the existing one");
            }
        }catch(Exception ex){
            System.out.println("Something went wrong");
        }
    }
    
}
