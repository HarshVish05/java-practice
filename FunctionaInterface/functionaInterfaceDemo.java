package FunctionaInterface;

@FunctionalInterface
// without using variables or lambda
// interface P1{
//     void display();
// }

interface P1{
    // void display(int i , int j); // method for just displaying
    int add(int i , int j); // method for returning values
}




public class functionaInterfaceDemo {
    public static void main(String[] args) {

        // using anonymous
        /* 
        P1 p = new P1() {
            public void display(){
                System.out.println("display in anonymous ");
            }
        };
        p.display();
        */

        //using lambda
        // P1 p = () -> System.out.println("display in anonymous using lambda ");           
        // p.display();

        // using lambda with variables
        // P1 p = (int i,int j) -> System.out.println("displaying "+i +"and "+j);
        // p.display(5,3);
        
        // using lambda with variables and returning it
        P1 p = (int i,int j) -> i+j;
        System.out.println("The sum is "+p.add(5,3));

    }
    
}
