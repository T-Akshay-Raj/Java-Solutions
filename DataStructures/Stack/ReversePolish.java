package DataStructures.Stack;

import java.util.Stack;

public class ReversePolish {

  public static void main(String[] args) {
    String expression = "3 4 +";
    double result = ReversePolish.evaluateRPN(expression);
    System.out.println("The result of the Reverse Polish notation expression is: " + result);//7.0

    String expression1 = "3 4 + 2 *";
    double result1 = ReversePolish.evaluateRPN(expression1);
    System.out.println("The result of the Reverse Polish notation expression is: " + result1);//14.0

    String expression2 = "3 4 + 2 * 7 /";
    double result2 = ReversePolish.evaluateRPN(expression2);
    System.out.println("The result of the Reverse Polish notation expression is: " + result2);//2.0
  }

  private static boolean isNumber(String token) {
    try {
      Double.parseDouble(token);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  private static boolean isOperator(String token) {
    return "+-*/".contains(token);
  }

  private static double performOperation(String operator, double operand1,
                                         double operand2) {
    switch (operator) {
      case "+":
        return operand1 + operand2;
      case "-":
        return operand1 - operand2;
      case "*":
        return operand1 * operand2;
      case "/":
        return operand1 / operand2;
      default:
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }
  }

  // Return the result of the Reverse Polish notation expression
  static double evaluateRPN(String expression) {
    // Your code goes here.
    double result = 0;
    Stack<Double> stack = new Stack();
    String[] tokens = expression.split("");
    for (String s : tokens) {
      if (isNumber(s)) {
        stack.push(Double.parseDouble(s));
      } else if (isOperator(s)) {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        result = performOperation(s, operand1, operand2);
        stack.push(result);
      }
    }
    return result;
  }

}


