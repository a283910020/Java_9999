package JavaArray;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class demo1 {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        TimeZone timeZone = TimeZone.getTimeZone("Australia/Sydney");
        calendar.setTimeZone(timeZone);
        Date currentTime = calendar.getTime();
        System.out.println(currentTime);

        Date today = new Date();
        System.out.println(today.getTimezoneOffset());

//        JOptionPane.showMessageDialog(null, "this is a dialog");
        String a = JOptionPane.showInputDialog(null, "this is a dialog");
        System.out.println(a);



    }


}
