class Car{
    String name;
    int price;

    public void CarInfo(){

        System.out.println("car name: "+this.name);
        System.out.println("car price: "+this.price);
        

    }
}
public class OOPS2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Mustang";
        c1.price = 27000000;
        c1.CarInfo();
        

        Car c2 = new Car();
        c2.name = "Ferrari";
        c2.price = 30000000;
        c2.CarInfo();
        

        Car c3 = new Car();
        c3.name = "Lambo";
        c3.price = 20987650;
        c3.CarInfo();
       

    }
    
}
