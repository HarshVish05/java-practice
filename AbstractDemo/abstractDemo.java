package AbstractDemo;

import javafx.scene.input.TouchEvent;

abstract class Car{
    public abstract void carColor();
    public void carMode(){
        System.out.println("Petrol");
    }
}

class Toyota extends Car{
    @Override
    public void carColor(){
        System.out.println("the car color is grey");
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        Toyota tyt= new Toyota();
        tyt.carColor();
        tyt.carMode();
    }
    
}
