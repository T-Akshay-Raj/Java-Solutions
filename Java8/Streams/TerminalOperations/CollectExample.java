package Java8.StreamsApi.TerminalOperations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//The collect() method is a terminal operation that collects the elements of the stream into a collection.
public class CollectExample {
  public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //Collect the elements of the stream into a list-Collectors.toList()
    List<Integer> intList = integerList.stream()
        .collect(Collectors.toList());
    System.out.println(intList);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    //Collect the elements of the stream into a set - Collectors.toSet()
    Set<Integer> intSet = integerList.stream()
        .collect(Collectors.toSet());
    System.out.println(intSet);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    //Collect the elements of the stream into a map - Collectors.toMap()
    Map<Integer, Integer> intMap = integerList.stream()
        .collect(Collectors.toMap(i -> i, i -> i * i));
    System.out.println(
        intMap);//{1=1, 2=4, 3=9, 4=16, 5=25, 6=36, 7=49, 8=64, 9=81, 10=100}

    //Collect to count the elements of the stream - Collectors.counting()
    Long count = integerList.stream()
        .collect(Collectors.counting());//10

    //Collect to sum the elements of the stream - Collectors.summingInt()
    Integer sum = integerList.stream()
        .collect(Collectors.summingInt(i -> i));//55

    //Collect to find the average of the elements of the stream - Collectors.averagingInt()
    Double avg = integerList.stream()
        .collect(Collectors.averagingInt(i -> i));//5.5

    //Collect to find the maximum element of the stream - Collectors.maxBy()
    Integer max = integerList.stream()
        .collect(Collectors.maxBy(Integer::compareTo)).get();//10

    //Collect to find the minimum element of the stream - Collectors.minBy()
    Integer min = integerList.stream()
        .collect(Collectors.minBy(Integer::compareTo)).get();//1

    //Collect to find the sum, average, maximum and minimum of the elements of the stream - Collectors.summarizingInt()
    IntSummaryStatistics intSummary = integerList.stream()
        .collect(Collectors.summarizingInt(
            i -> i));//IntSummaryStatistics{count=10, sum=55, min=1, average=5.500000, max=10}


    //Collect the elements and their count into a map - Collectors.groupingBy()
    Map<Integer, Long> intCountMap = integerList.stream()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    System.out.println(
        intCountMap);//{1=1, 2=1, 3=1, 4=1, 5=1, 6=1, 7=1, 8=1, 9=1, 10=1}

    //Collect the elements of the stream into a list and join them with a delimiter - Collectors.joining()
    String intJoin = integerList.stream()
        .map(i -> String.valueOf(i))
        .collect(Collectors.joining(","));
    System.out.println(intJoin);//1,2,3,4,5,6,7,8,9,10

    //Collect the elements of the stream into a list and join them with a delimiter,prefix and Suffix - Collectors.joining()
    String intJoin1 = integerList.stream()
        .map(i -> String.valueOf(i))
        .collect(Collectors.joining(",", "[", "]"));//[1,2,3,4,5,6,7,8,9,10]


  }
}
