package java_essentials;

import java.util.Scanner;
//Arithmetic operation with switch
public class SwitchExample2 {
  public static void main(String[] args) {
    int value1, value2;
    String operation;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter value 1: ");
    value1=scan.nextInt();
    System.out.println("Enter value 2: ");
    value2=scan.nextInt();

    System.out.println("Enter operation to be performed: ");
    System.out.println("Note: Valid Operation are +,-,/,* ");
    operation= scan.next();

    System.out.println("Performing Calculation ");
    float result=performOperation(value1,value2,operation);
    System.out.println("Result = "+result);

  }

  private static float performOperation(int value1, int value2, String operation) {
    return switch (operation) {
      case "+"->{
        System.out.println(value1+"+"+value2+" is ");
        yield value1+value2;
      }
      case "-"->{
        System.out.println(value1+"-"+value2+" is ");
        yield value1-value2;
      }
      case "*"->{
        System.out.println(value1+"*"+value2+" is ");
        yield value1*value2;
      }
      case "/"->{
        System.out.println(value1+"/"+value2+" is ");
        yield value1/value2;
      }
      default -> throw new IllegalStateException(
          "Unexpected value: " + operation+" Valid Operation are +,-,/,*");
    };
  }
}
