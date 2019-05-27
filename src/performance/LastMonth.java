package performance;

import java.util.Calendar;
import java.util.Map;

public class LastMonth {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,-1);
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
    }


}
