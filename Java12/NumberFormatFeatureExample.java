package Java12;

import java.text.NumberFormat;
import java.util.Locale;
// NumberFormat.getCompactNumberInstance() method returns the instance of NumberFormat for compact number formatting.
//use case: to format a number in a compact form like 1K, 1M, 1B, etc.

//NumberFormat.getCompactNumberInstance() method returns the instance of NumberFormat for compact number formatting.
//NumberFormat.getCompactNumberInstance(Locale locale, NumberFormat.Style style) method returns the instance of NumberFormat for compact number formatting with the specified locale and style.
//The style can be SHORT or LONG.


public class NumberFormatFeatureExample {
  public static String getCompactNumberFormat(int i) {
    return NumberFormat.getCompactNumberInstance().format(i);
  }

  public static String getCompactNumberFormat(int i, Locale locale,  NumberFormat.Style style) {
    return NumberFormat.getCompactNumberInstance(locale, style).format(i);
  }

  public static void main(String[] args) {

    System.out.println(getCompactNumberFormat(1000));//1K

    System.out.println(getCompactNumberFormat(1000, Locale.US, NumberFormat.Style.SHORT));//1K
    System.out.println(getCompactNumberFormat(1000, Locale.US, NumberFormat.Style.LONG));//1 thousand

  }
}
