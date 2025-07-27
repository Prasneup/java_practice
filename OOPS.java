class Student{
    String name;
    int age;
    int roll_number;
    double height;
    String address;

    public void StudInfo(){
        System.out.println("The name of student is "+this.name);
        System.out.println("The age of student is "+this.age);
        System.out.println("The roll_number of student is "+this.roll_number);
        System.out.println("The height of student is "+this.height);
        System.out.println("The address of student is "+this.address);

    }

}

public class OOPS{
    public static void main(String[]args){
        Student s = new Student();
        s.name = "Ram";
        s.age = 19;
        s.roll_number = 21;
        s.height = 196.33;
        s.address = "Nepal";
        s.StudInfo();
    }
}
