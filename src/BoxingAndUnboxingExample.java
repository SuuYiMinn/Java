import java.time.LocalDate;
import java.util.ArrayList;

public class BoxingAndUnboxingExample {
        public static void main(String[] args) {

                ArrayList<Integer> arrLstInts = new ArrayList<Integer>();
                arrLstInts.add(Integer.valueOf(0));
                arrLstInts.add(2); // Java automatically box int to Integer

                Integer i1 = arrLstInts.get(0);
                int i2 = arrLstInts.get(1); // Java automatically unbox Integer to int
        }
}
