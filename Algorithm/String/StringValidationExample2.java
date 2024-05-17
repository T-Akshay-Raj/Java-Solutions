package Algorithms.String;

public class StringValidationExample2 {
  public static void main(String[] args) {
    String str1="abcd";
    String str2="abcd1";
    String str3="1234";
    String str4="ab12j3";
    String str5="528&7s";
    String str6="bsh384C";
    System.out.println("Check if String "+str1+"contains only characters :" +checkContainsOnlyCharacter(str1));
    System.out.println("Check if String "+str2+" contains only characters :" +checkContainsOnlyCharacter(str2));

    System.out.println("Check if String "+str3+"contains only characters :" +checkContainsOnlyDigits(str3));
    System.out.println("Check if String "+str4+" contains only characters :" +checkContainsOnlyDigits(str4));

    System.out.println("Check if String "+str3+"contains only characters and digits :" +checkContainsOnlyCharacterOrDigits(str3));
    System.out.println("Check if String "+str5+" contains only characters and digits :" +checkContainsOnlyCharacterOrDigits(str5));

    System.out.println("Check if String "+str4+"contains password condition :" +checkPasswordCondition(str4));
    System.out.println("Check if String "+str6+" contains password condition :" +checkPasswordCondition(str6));


  }
  //validate if String contains all characters only
  private static boolean checkContainsOnlyCharacter(String str)
  {
    return str.chars().allMatch(Character::isAlphabetic);
  }
  //validate if String contains all numbers only
  private static boolean checkContainsOnlyDigits(String str)
  {
    return str.chars().allMatch(Character::isDigit);
  }

  //validate if String contains only letter and Digits
  private static boolean checkContainsOnlyCharacterOrDigits(String str)
  {
    return  str.chars().allMatch(Character::isLetterOrDigit);
  }

  //validate if String contains atleast one-capital letter,one-small letter and one digit
  private static boolean checkPasswordCondition(String str)
  {
    return str.chars().anyMatch(Character::isLowerCase) &&
        str.chars().anyMatch(Character::isUpperCase) &&
        str.chars().anyMatch(Character::isDigit);
  }
}
