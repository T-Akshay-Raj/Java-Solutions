package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

/*
383. Ransom Note
Easy

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.

Topics: Hash Table, String, Counting
 */
public class RansomNote {
  public static void main(String[] args) {
    RansomNote rn = new RansomNote();
    System.out.println(rn.canConstruct("a", "b"));//false
    System.out.println(rn.canConstruct("aa", "ab"));//false
    System.out.println(rn.canConstruct("aa", "aab"));//true
    System.out.println(rn.canConstruct("bg",
        "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));//true


    //Approach 2:
    System.out.println("Approach 2");
    System.out.println(rn.canConstruct1("bg",
        "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));//true
    System.out.println(rn.canConstruct1("a", "b"));//false
    System.out.println(rn.canConstruct1("aa", "ab"));//false
    System.out.println(rn.canConstruct1("aa", "aab"));//true

    //Approach 3:
        System.out.println("Approach 3");
        System.out.println(rn.canConstruct2("bg",
            "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));//true
        System.out.println(rn.canConstruct2("a", "b"));//false
        System.out.println(rn.canConstruct2("aa", "ab"));//false
        System.out.println(rn.canConstruct2("aa", "aab"));//true
  }


  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }
    int[] alphabets_counter = new int[26];

    for (char c : magazine.toCharArray()) {
      alphabets_counter[c - 'a']++;
    }

    for (char c : ransomNote.toCharArray()) {
      if (alphabets_counter[c - 'a'] == 0) {
        return false;
      }
      alphabets_counter[c - 'a']--;
    }
    return true;
  }


  public boolean canConstruct1(String ransomNote, String magazine) {
    Map<Character, Integer> str1Map = createMap(ransomNote.toCharArray());
    Map<Character, Integer> str2Map = createMap(magazine.toCharArray());
    for (char c : str1Map.keySet()) {
      if ((str2Map.containsKey(c)) && (str2Map.get(c) >= str1Map.get(c))) {
      } else {
        return false;
      }
    }
    return true;
  }

  private Map<Character, Integer> createMap(char[] strchars) {
    Map<Character, Integer> strMap = new HashMap<>();
    for (char c : strchars) {
      if (strMap.containsKey(c)) {
        strMap.put(c, strMap.get(c) + 1);
      } else {
        strMap.put(c, 1);
      }
    }
    return strMap;
  }

  //Alternate Approach using single map and reduce count if found
  //time Complexity: O(m)
  //Space Complexity: O(k) k is distinct letter
  public boolean canConstruct2(String ransomNote, String magazine) {
    HashMap<Character, Integer> magazineMap = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      char m = magazine.charAt(i);
      int currentCount = magazineMap.getOrDefault(m, 0);
      magazineMap.put(m, currentCount + 1);
    }
    for (int j = 0; j < ransomNote.length(); j++) {
      char r = ransomNote.charAt(j);
      int currentCount = magazineMap.getOrDefault(r, 0);
      if (currentCount == 0) {
        return false;
      }
      magazineMap.put(r, currentCount - 1);
    }
    return true;
  }
}
