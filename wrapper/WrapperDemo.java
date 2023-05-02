package wrapper;
import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // Integer i = Integer.parseInt(s);
        // System.out.println("the no entered is "+ i);
        int num =2;
        Integer a = num; // auto boxing
        System.out.println(a);

        int num1 = a;// auto-unboxing
        System.out.println(num1);
    }
}
