import com.harsh.core.AccessModifier;
import com.harsh.core.AdvCalc;
import com.harsh.core.Calc;
import java.util.List;
import java.util.ArrayList;

public class CalcDemo {
    public static void main(String[] args) {
        // Calc cal = new Calc();
        // System.out.println(cal.add(2,3));

        // AdvCalc advcal = new AdvCalc();
        // System.out.println(advcal.mul(2, 3));

        // cal.display();
        // advcal.display();

        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        System.out.println(al);

        AccessModifier am = new AccessModifier();
        System.out.println(am.age);

        AccessModifierTest amt = new AccessModifierTest();
        System.out.println(amt.age);
    }
}
