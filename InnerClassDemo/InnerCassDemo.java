package InnerClassDemo;


class P1{
    // String name;
    static String name;
    public void getname(){
        System.out.println(name + " from P1");
    }

    // class P2{
    static class P2{
        public void display(){
            System.out.println(name+" from P2");
        }
    }
}

public class InnerCassDemo {
    public static void main(String[] args) {
        P1 p = new P1();
        p.name="Harsh";
        p.getname();

        // P1.P2 pb = p.new P2();
        // pb.display();

        // Another method
        P1.P2 ob = new P1.P2();
        ob.display();
    }
    
}
