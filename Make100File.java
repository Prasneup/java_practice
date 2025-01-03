import java.io.File;
public class Make100File {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            deleteFile("hello"+i+".txt");
        }
        
    }
    public static void deleteFile(String filename){
    try{
        File f = new File (filename);
        if(f.delete()){
            System.out.println("deleted");
        }else{
            System.out.println("No File availabe.");
        }
        }catch(Exception ex){
            System.out.println("Something wrong!!!!");


        }
   } 
}
