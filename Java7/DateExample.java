package Java7;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
  public static void main(String[] args) {
    Date d = new Date();//System.currentTimeMillis()
    System.out.println(d);//Tue Apr 09 13:52:08 IST 2024
//or
    GregorianCalendar gc = new GregorianCalendar();
    System.out.println(gc.getTime());//Tue Apr 09 13:52:08 IST 2024
//Custom date
    GregorianCalendar gc1 = new GregorianCalendar(2024, 03, 9);
    System.out.println(gc1.getTime());//Tue Apr 09 00:00:00 IST 2024

    //Format date
    DateFormat df = DateFormat.getDateInstance();
    System.out.println(df.format(d));//Apr 9, 2024

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);//2024-04-09T13:54:40.245

    LocalDate ld = LocalDate.now();
    System.out.println(ld);//2024-04-09

    //DateTimeFormatterExample
    DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
    System.out.println(dtf.format(ld));

    //DateTimeFormatterExample custom
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
    System.out.println(dtf2.format(ld));// 4/9/2024
  }
}
