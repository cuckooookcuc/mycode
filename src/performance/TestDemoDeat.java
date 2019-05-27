package performance;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TestDemoDeat {


    public static int[] getKPI_Months(int number/*需要几天*/){
        LocalDate today = LocalDate.now();
        int[] KPI_Months=new int[number];
        KPI_Months[0]=today.getMonthValue();
        for (int i=1;i<number;i++)
        {
            today = today.minusMonths(1);
            KPI_Months[i]=today.getMonthValue();
        }
        return KPI_Months;
    }

    public static void main(String[] args )
    {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.add(Calendar.MONTH, -1);
//        Date m = c.getTime();
//        System.out.println(sdf.format(m));

//        LocalDate today = LocalDate.now();
//        int[] KPI_Months=new int[2];
//        KPI_Months[0]=3;
//        for (int i=1;i<3;i++)
//        {
//            today = today.minusMonths(1);
//            //DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM");
//            //System.out.println(formatters.format(today));
//            KPI_Months[i]=today.getMonthValue();
//        }

        int[] a=getKPI_Months(4);
        for (int t :
                a) {
            System.out.println(t);
        }


    }
}
