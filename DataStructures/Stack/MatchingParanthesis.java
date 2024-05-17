package DataStructures.Stack;

import java.util.Stack;

public class MatchingParanthesis {
  public static void main(String[] args) {
    String expression = "{[()]}";
    System.out.println("Expression: " + expression + " is balanced: " +isBalanced(expression));//Yes
    expression = "{[()]";
    System.out.println("Expression: " + expression + " is balanced: " +isBalanced(expression));//No
  }

  /*
  The time complexity of this algorithm is O(n) where n is the length of the input expression. This is because we iterate through each character in the expression exactly once.
  The space complexity is also O(n) in the worst case scenario where all opening brackets are present before closing brackets. This is because in the worst case, we may need to store all opening brackets in the stack before encountering their corresponding closing brackets.
   */
  private static String isBalanced(String expression) {
    Stack<Character> paranthesis = new Stack<>();
    for (char c : expression.toCharArray()) {
      if (c == '{' || c == '[' || c == '(') {
        paranthesis.push(c);
      } else if (c == '}' || c == ']' || c == ')') {
        if (paranthesis.isEmpty()) {
          return "No";
        }
        char temp = paranthesis.pop();
        if (temp == '{' && c == '}' || temp == '[' && c == ']' ||
            temp == '(' && c == ')') {
          continue;
        } else {
          return "No";
        }
      }
    }
    return paranthesis.isEmpty() ? "Yes" : "No";
  }

 /*
 The time complexity of this function is O(n), where n is the length of the input expression. This is because the function iterates through each character in the expression exactly once.
The space complexity of this function is O(1) because the function only uses a constant amount of extra space regardless of the size of the input expression. The variables flowerbrace, squarebrace, and roundbrace are integers that store the count of each type of brace, and they do not scale with the size of the input expression.
  */
  private static String isBalanced1(String expression) {
    int flowerbrace = 0, squarebrace = 0, roundbrace = 0;
    for (int i = 0; i < expression.length(); i++) {
      if (expression.charAt(i) == '{') {
        flowerbrace++;
      } else if (expression.charAt(i) == '[') {
        squarebrace++;
      } else if (expression.charAt(i) == '(') {
        roundbrace++;
      } else if (expression.charAt(i) == '}') {
        flowerbrace--;
      } else if (expression.charAt(i) == ']') {
        squarebrace--;
      } else if (expression.charAt(i) == ')') {
        roundbrace--;
      }
    }
    return flowerbrace == 0 && squarebrace == 0 && roundbrace == 0 ? "Yes" : "No";
  }

  /*
 The time complexity of this function is O(n), where n is the length of the input expression. This is because the function iterates through each character in the expression exactly once.
The space complexity of this function is O(1) because the function only uses a constant amount of extra space regardless of the size of the input expression. The variables flowerbrace, squarebrace, and roundbrace are integers that store the count of each type of brace, and they do not scale with the size of the input expression.
  */
  private static String isBalanced2(String expression) {
    int flowerbrace = 0, squarebrace = 0, roundbrace = 0;
    for (int i = 0; i < expression.length(); i++) {
      switch (expression.charAt(i)) {
        case '{':
          flowerbrace++;
          break;
        case '[':
          squarebrace++;
          break;
        case '(':
          roundbrace++;
          break;
        case '}':
          flowerbrace--;
          break;
        case ']':
          squarebrace--;
          break;
        case ')':
          roundbrace--;
          break;
      }
    }
    return flowerbrace == 0 && squarebrace == 0 && roundbrace == 0 ? "Yes" : "No";
  }

}
