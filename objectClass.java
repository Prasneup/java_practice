class Pen{
    int id;
    String name;
    String color;
    int price;

    public void printWrite(){
        System.out.println("Pen id is "+this.id);
        System.out.println("Pen name is "+this.name);
        System.out.println("Pen color is "+this.color);
        System.out.println("Pen priice is "+this.price);
    }
}




public class objectClass {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.id=1;
        p1.name="Paras";
        p1.color="Green";
        p1.price=50;

        p1.printWrite();
    }
    
}
