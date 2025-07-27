class Car{
  String model;
  String color;
  int year;
  double price;
  String owner;


  public void displayCarDetails(String model, String color, String owner, int year, double price){
    System.out.println("The model of car is: "+ model);
    System.out.println("The color of the car is:"+ color);
    System.out.println("The year I bought it is: "+ year);
    System.out.println("The price of the car is: "+ price);
    System.out.println("The owner of the car is: "+ owner);

  }


  public static void main(String[] args) {
    Car car1 = new Car();
    car1.displayCarDetails("Porche","Red", "Prasanna Neupane", 2026, 20000000.00);
  }
}







