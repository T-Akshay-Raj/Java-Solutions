package Java8.StreamsApi.IntermediateOperation;

import Java8.StreamsApi.model.Person;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
//Distinct() method returns a stream consisting of the distinct elements of this stream.
public class DistinctExample {
  public static void main(String[] args) {
    List<Integer> intList = asList(1, 3, 2, 3, 5, 2, 1, 4, 5, 4);
    System.out.println("Distinct Elements from List : "+getDistinctElements(intList));

    List<String> fruits = asList("Apple", "Banana", "Mango", "Banana", "Apple", "Mango");
    System.out.println("Distinct Elements from List : "+fruits.stream().distinct().collect(Collectors.toList()));//Distinct Elements from List : [Apple, Banana, Mango]

    List<Person> personList= asList(new Person(10L, "JOHN"), new Person(20L, "SARA"), new Person(10L, "JOHN"));
    System.out.println("Distinct Elements from List : "+personList.stream().distinct().collect(Collectors.toList()));//Distinct Elements from List : [Person{id=10, name='JOHN'}, Person{id=20, name='SARA'}]

    //Other operations clubbed with distinct
    System.out.println("Distinct Elements from List and sorted: "+getDistinctElementsSorted(intList));
    System.out.println("Distinct Elements from List and Higher than k in sorted order: "+getDistinctElementsSortedAndHigherThanK(intList,3));
    System.out.println("Distinct Elements from List and Higher than k in descending sorted order: "+getDistinctElementsDescendingSortedAndHigherThanK(intList,3));
  }




  private static List<Integer> getDistinctElements(List<Integer> intList) {
    return intList.stream().distinct().collect(Collectors.toList()); //Distinct Elements from List : [1, 3, 2, 5, 4]
  }
  private static List<Integer> getDistinctElementsSorted(List<Integer> intList) {
    return intList.stream().distinct().sorted().collect(Collectors.toList());//Distinct Elements from List and sorted: [1, 2, 3, 4, 5]
  }
  private static List<Integer> getDistinctElementsSortedAndHigherThanK(List<Integer> intList, int k) {
    return intList.stream().distinct().filter(x->x>k).sorted().collect(Collectors.toList());//Distinct Elements from List and Higher than k in sorted order: [4, 5]
  }

  private static List<Integer>  getDistinctElementsDescendingSortedAndHigherThanK(List<Integer> intList, int k){
    return intList.stream().distinct().filter(x->x>k).sorted(Collections.reverseOrder()).collect(Collectors.toList());//Distinct Elements from List and Higher than k in descending sorted order: [5, 4]

  }
}
