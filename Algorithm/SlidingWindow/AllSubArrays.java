package Algorithms.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class AllSubArrays {
  public static void main(String[] args) {
    int[] nums = {10, 5, 2, 6};
    int k = 100;
    System.out.println("Print all subarrays");
    printAllSubArrays(nums, k);
  }

  private static void printAllSubArrays(int[] nums, int k) {
    List<List<Integer>> reslist=new ArrayList<>();
    int curr=0;
    List<Integer> intlist=new ArrayList<>();
    for(int i:nums){
     intlist.add(i);
    }
    reslist.add(intlist);


    System.out.println(reslist);
  }


}
