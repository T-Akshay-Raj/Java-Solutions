package Algorithms.String;

//Checks whether the given String contains all characters 1.Uppercase 2.Lowercase
public class StringExample1 {
  public static void main(String[] args) {
    String s1 = "HelloWorld";
    String s2 = "HELLOWORLD";
    String s3 = "helloworld";
    //uppercase check
    System.out.println("Given String 'HelloWorld' contains all uppercase: " +
        checkIsUppercase(s1)); //false
    System.out.println("Given String 'HELLOWORLD' contains all uppercase: " +
        checkIsUppercase(s2)); //true
    System.out.println("Given String 'helloworld' contains all uppercase: " +
        checkIsUppercase(s3));//false


    //lowecase check
    System.out.println("Given String 'HelloWorld' contains all lowercase: " +
        checkIsLowercase(s1));//false
    System.out.println("Given String 'HELLOWORLD' contains all lowercase: " +
        checkIsLowercase(s2));//false
    System.out.println("Given String 'helloworld' contains all lowercase: " +
        checkIsLowercase(s3));//true

    //alternate approach
    System.out.println("Given String 'HelloWorld' contains all uppercase: " +
        checkIsUppercase1(s1));//false
    System.out.println("Given String 'HELLOWORLD' contains all uppercase: " +
        checkIsUppercase1(s2));//true
  }


  //String.chars() to create a stream of characters and use allMatch  to verify each character
  private static boolean checkIsUppercase(String s1) {
    return s1.chars().allMatch(Character::isUpperCase);
  }


  private static boolean checkIsLowercase(String s1) {
    return s1.chars().allMatch(Character::isLowerCase);
  }

  //Alternate Approach: String.chars() to create a stream of characters and  nonematch to verify each character
  private static boolean checkIsUppercase1(String s1) {
    return s1.chars().noneMatch(Character::isLowerCase);
  }

  private static boolean checkIsLowercase1(String s1) {
    return s1.chars().noneMatch(Character::isUpperCase);
  }

}
