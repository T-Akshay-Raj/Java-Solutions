package Preparation.Zemoso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStrings {
  public static void main(String[] args) {
    List<String>
        list1 =
        Arrays.asList("Apple", "Banana", "Mango", "Pineapple", "Orange");
    System.out.println(sortList(list1));

    System.out.println(sortList1(list1));
    System.out.println(sortList2(list1));
    System.out.println(sortList3(list1));

  }

  //approach 1: using Collections.sort() method of List
  private static List<String> sortList(List<String> list1) {
    list1.sort((s1, s2) -> s1.compareTo(s2));
    return list1;
  }

  //approach 2: using stream
  private static List<String> sortList1(List<String> list1) {
    list1.stream().sorted((s1, s2) -> s1.compareTo(s2));
    return list1;
  }

  //sort list of string using java 8 streams api
  private static List<String> sortList2(List<String> list1) {
    list1 = list1.stream().sorted().collect(Collectors.toList());
    return list1;
  }

  //sort a list of Strings using Arrays.sort
  private static List<String> sortList3(List<String> list1) {
    String[] str = new String[list1.size()];
    str = list1.toArray(str);
    Arrays.sort(str);
    list1 = Arrays.asList(str);
    return list1;
  }


}
