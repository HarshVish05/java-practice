class Car{
    String brand;
    long price;
    static String type;

    Car(String brand, long price ){
        this.brand = brand;
        this.price = price;
    }
    static{
        type="sedan";
        System.out.println("inside static");

    }
    {
        System.out.println("inside inint block");
    }
    public Car(){
        brand="";
        price=0;
        type="hatchback";
        System.out.println("inside constructor");
    }

    public  void display() {
        System.out.println(brand + " " + price + " "+ type);
    }

    public static void show() {
        System.out.println( " "+ type);
    }
}





public class StatciDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("mercedes",250000);
        // car.price= 10000000;
        // car.type="hatchback";

        car.display();
        car1.display();

        Car.show(); 
    }
    
}
