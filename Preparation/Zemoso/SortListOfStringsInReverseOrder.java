package Preparation.Zemoso;

import java.util.Arrays;
import java.util.List;

public class SortListOfStringsInReverseOrder {
  public static void main(String[] args) {
    List<String> list1 =
        Arrays.asList("Apple", "Banana", "Mango", "Pineapple", "Orange");
    System.out.println(sortList(list1));

  }

  //Approach 1: Using Collections.sort() method of List
  private static List<String> sortList(List<String> list1) {
    list1.sort((s1, s2) -> s2.compareTo(s1));
    return list1;
  }

  //Approach 2: Using Streams
  private static List<String> sortList2(List<String> list1) {
    list1.stream().sorted((s1, s2) -> s2.compareTo(s1));
    return list1;
  }

  //Approach 3: sort a list of Strings using Arrays.sort in reverse order
  private static List<String> sortList4(List<String> list1) {
    String[] str = new String[list1.size()];
    str = list1.toArray(str);
    Arrays.sort(str, (s1, s2) -> s2.compareTo(s1));
    list1 = Arrays.asList(str);
    return list1;
  }

}
