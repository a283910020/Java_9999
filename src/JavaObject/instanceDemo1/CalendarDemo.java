package JavaObject.instanceDemo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);

        System.out.println(year+ " " + month + " " + day);

        cal.set(2012, 5, 12,14,18,22);
        Date date = cal.getTime();
        System.out.println(date.toLocaleString());

        SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss:SSS");
        String strDate = format0.format(date);
        System.out.println(strDate);

//        Date newDate = format0.parse("2013-3-23 23:45:43:999");
//        System.out.println(newDate.toLocaleString() );




    }

}
