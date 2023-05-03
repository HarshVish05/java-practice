package InnerClassDemo;


class P1{
    // String name;
    static String name;
    public void getname(){
        System.out.println(name + " from P1");
    }
}

public class AnonymousInnerCass {
    public static void main(String[] args) {
        P1 p = new P1(){
            public void getname(){
                System.out.println(name + "in anonymous class");
            }
        };
        p.name="Harsh";
        p.getname();
    }
    
}
