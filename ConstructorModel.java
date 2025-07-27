public class ConstructorModel{
    int modelYear;
    String modelName;
    int modelPrice;

    public ConstructorModel(int year, String name, int price){
        modelYear = year;
        modelName = name;
        modelPrice = price;
    }

    public static void main(String[] args) {
        ConstructorModel c = new ConstructorModel(1969, "Mustang", 2350000);
        System.out.println("The model year was "+c.modelYear);
        System.out.println("The name of car is "+c.modelName);
        System.out.println("The price of car is "+c.modelPrice);
    }
    

}