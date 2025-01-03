import java.io.File;
public class PracticeCreateTextFile {
    public static void main(String[] args) {
        try{
            File f = new File("myfile.txt");
            if(f.createNewFile()){
                System.out.println("File Created......");
            }else{
                System.out.println("Already exists.....");
            }
        }catch(Exception ex){
            System.out.println("Something is wrong!!!!!!");
        }
    }
    
}
