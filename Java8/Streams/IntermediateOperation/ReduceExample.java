package Java8.StreamsApi.IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {
  public static void main(String[] args) {

    //sum of squares of all elements
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum=numbers.stream().map(x->x*x).reduce(0,(a,b)->a+b).intValue();
    System.out.println(sum);//55

    List<String> fruits1 = Arrays.asList("Carrot", "Banana", "Dragon Fruit", "Apple");
    System.out.println(fruits1.stream().sorted().reduce("",(a,b)->a+b+","));//Apple,Banana,Carrot,Dragon Fruit,



  }
}
