import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class LinkedListExample {
        public static void main(String[] args) {
                LinkedList<GregorianCalendar> linkedLst = new LinkedList<GregorianCalendar>();
                linkedLst.add(new GregorianCalendar(2021, 0, 1));
                linkedLst.add(new GregorianCalendar(2022, 0, 1));
                linkedLst.add(new GregorianCalendar(2023, 0, 1));

                boolean b = linkedLst.remove(new GregorianCalendar(2021, 0, 1));
                System.out.println(b);
                System.out.println(linkedLst.size());
                System.out.println("---------------------------");

                linkedLst.add(0, new GregorianCalendar(2020, 0, 1));
                linkedLst.add(1, new GregorianCalendar(2021, 0, 1));

                for (int i = 0; i < linkedLst.size(); i++) {
                        GregorianCalendar cal = linkedLst.get(i);
                        System.out.println(cal.get(Calendar.YEAR));
                }
                System.out.println("---------------------------");

                GregorianCalendar cal1 = linkedLst.set(3, new GregorianCalendar(2025, 0, 1));
                System.out.println("Old date: " + cal1.get(Calendar.YEAR));

                for (int i = 0; i < linkedLst.size(); i++) {
                        GregorianCalendar cal = linkedLst.get(i);
                        System.out.println(cal.get(Calendar.YEAR));
                }
                System.out.println("---------------------------");

                linkedLst.remove(2);
                for (int i = 0; i < linkedLst.size(); i++) {
                        GregorianCalendar cal = linkedLst.get(i);
                        System.out.println(cal.get(Calendar.YEAR));
                }
        }
}
