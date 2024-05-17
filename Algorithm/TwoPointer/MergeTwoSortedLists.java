package Algorithms.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {
  public static void main(String[] args) {
List<Integer> intList1= Arrays.asList(1,2,4);
List<Integer> intList2= Arrays.asList(1,3,4);

    List<Integer> result1=getSortedMergedListBruteForce(intList1,intList2);
    System.out.println(result1);

//List<Integer> result=getSortedMergedList(intList1,intList2);
//    System.out.println(result);
  }
//Native approach: brute force by adding all elements from list1 and list2 to result and apply sorting
  private static List<Integer> getSortedMergedListBruteForce(List<Integer> intList1, List<Integer> intList2) {
    List<Integer> res=new ArrayList<>();
    int i=0,j=0;
    while(i<intList1.size())
    {
      res.add(intList1.get(i));
      i++;
    }
    while(j<intList2.size()){
      res.add(intList2.get(j));
          j++;
    }
    Collections.sort(res);
    return res;
  }

  private static List<Integer> getSortedMergedList(List<Integer> intList1, List<Integer> intList2) {
    List<Integer> res=new ArrayList<>();
    int i=0,j=0;
    while(i<intList1.size() && j<intList2.size())
    {
      if(intList1.get(i)<intList2.get(j)) {
        res.add(intList1.get(i));
        i++;
      }
      else {
        res.add(intList2.get(j));
        j++;
      }
    }
    while(i<intList1.size()) {
      res.add(intList1.get(i));
      i++;
    }

    while(j<intList2.size()) {
      res.add(intList2.get(j));
      j++;
    }

    return res;
  }
}
