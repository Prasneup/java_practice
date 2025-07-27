import java.io.File;
public class CreateManyFiles {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            Createfile("thanku"+i+".txt");
        }
    }
    public static void Createfile(String filename){
        try{
          File f = new File("thanku.txt");
          if(f.createNewFile()){
            System.out.println("file created");
          }else{
            System.out.println("Already exists");
          }
        }catch(Exception e){
            System.out.println("Invalid!!");
        }
    }
}
