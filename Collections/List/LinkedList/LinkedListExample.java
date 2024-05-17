package Collections.List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
  public static void main(String[] args) {
    //1 . declare, Instantiate and  Initialize  list
    List<Integer> integerList = new LinkedList<>();
    integerList.add(78);
    integerList.add(32);
    integerList.add(14);
    integerList.add(56);
    integerList.add(4);

    //print list
    System.out.println("Elements of list :" + integerList);

    //Initialize using Arrays.asList()
    LinkedList<Integer> intList1 =
        new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println("Elements of list: " + intList1);

    //add at first or any index using add(index,element)
    integerList.add(0,6);

    System.out.println("Elements of list :" + integerList);

    //remove last
    integerList.remove(integerList.size()-1);
    System.out.println("Elements of list :" + integerList);
  }
}
