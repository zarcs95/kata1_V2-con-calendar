package kata1_v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;   
    private final Calendar birthday;
    private static final long MILLISECODS_PER_YEAR = (long) (1000 * 60 * 60* 24* 365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        Calendar today;
        today = GregorianCalendar.getInstance();
        
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECODS_PER_YEAR;
    }
}
