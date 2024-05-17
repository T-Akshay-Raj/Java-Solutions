package java_essentials.Interface;

public interface Product {
 // String name = "";//Fields of Interface are implicitly static and Final and Need to be set during declaration

  //methods in interface could be abstract, default or static, these are non access modifiers
  String getName(); //methods in interface are by default pubic and abstract

  //default methods
  default String getDetails(){return "Empty Product";}

  //static method
  static void message(){
    System.out.println("From Product Interface");
  }
}
