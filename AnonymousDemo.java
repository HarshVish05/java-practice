class A{
    A(int n ){

        System.out.println("inside A constructor" + n);
    }
}
class B extends A{
    // int a;
    B(){
        super(67);
        System.out.println("inside B constructor");
    }
    public void display(int a){

        System.out.println("print statement inside B "+a);
    }
}




public class AnonymousDemo {
    public static void main(String[] args) {
        B b = new B();
        // new B().display(34);
        

    }
    
}
