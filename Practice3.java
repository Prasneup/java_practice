import java.io.File;
public class Practice3 {
    public static void main(String[] args) {
        for(int i=1; i>=100; i++){
            deleteFile("file"+i+".txt");
        }
        
    }
    public static void deleteFile(String fileName){
        try{
            File f = new File(fileName);
            if(f.delete()){
                System.out.println("File deleted.....");
            }else{
                System.out.println("Nofile.........");
            }
        }catch(Exception ex){
            System.out.println("Something wrong");
        }
    }
    
}
