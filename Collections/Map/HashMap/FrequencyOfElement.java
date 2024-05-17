package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
  public static void main(String[] args) {
    int[] input = {132, 323, 423, 323, 234, 43, 423, 24, 3, 123, 231, 323};
    getFrequency(input);
  }

  private static void getFrequency(int[] input) {
    Map<Integer, Integer> frequencies = new HashMap<>();
    for (int i : input) {
      if (frequencies.containsKey(i)) {
        frequencies.put(i, frequencies.get(i) + 1);//override value
      } else {
        frequencies.put(i, 1);
      }
    }
    System.out.println(frequencies);
  }
}
