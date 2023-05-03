package InterfacesDemo;

interface Car{
    void color();
}
interface Mode{
    void typeof();
}

class Toyota implements Car,Mode{
    public void color(){
        System.out.println("the color is red");
    }

    @Override
    public void typeof() {
        System.out.println("The type is elelctric");
    }
}

class Hyundai implements Car,Mode{
    public void color(){
        System.out.println("the color is green");
    }

    @Override
    public void typeof(){
        System.out.println("the type is petrol");
    }
}

class NewCar{
    public void type(Car car){
        car.color();
    }
    public void modeof(Car car,Mode mode){
        car.color();
        mode.typeof();
    }
}



public class interfacesDemo {
    public static void main(String[] args) {
        Car t = new Toyota();
        Car h = new Hyundai();
        Mode t1 = new Toyota();

        NewCar nc = new NewCar();
        nc.type(t);
        nc.type(h);
        // t1.typeof();
        nc.modeof(h, t1);
    }
    
}
