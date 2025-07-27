//Program to execute a 3*3 matrix in multi dimensional array(2d array)
public class TwoDimensionalArray{
    public static void main(String[] args) {
        String [][] things = {{"Mango","Cherry","Banana"},{"Eight","Nine","Ten"},{"Ginger","Garlic","Corriander"}};

        for(int i=0; i<things.length; i++){
            System.out.println();
            for(int j=0; j<things[i].length; j++){
                System.out.print(things[i][j]+" ");
            }
        }
    }
}