package kata1_v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1_V2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995, 7, 29);
        
        Person person = new Person("Javier", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
