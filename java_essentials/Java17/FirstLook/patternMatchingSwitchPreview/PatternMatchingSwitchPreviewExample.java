package java_essentials.Java17.FirstLook.patternMatchingSwitchPreview;

//preview feature of java 17
public class PatternMatchingSwitchPreviewExample {
  public static void main(String[] args) {
    // Pattern Matching for switch expressions

    displayObjectType(1);//1
    displayObjectType("hello");//5
    displayObjectType(Byte.MIN_VALUE);//-128
    displayObjectType(20.25);//0
    displayObjectType(null); //null pointer expression
  }

  public static void displayObjectType(Object obj) {
    int result = switch (obj) {
      case Integer i -> i;
      case String s -> s.length();
      case Byte b -> b;
      default -> 0;
    };
    System.out.println("result = " + result);
  }

}
