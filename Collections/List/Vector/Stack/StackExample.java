package Collections.List.Vector.Stack;


import java.util.Iterator;
import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {


    //Stack follows last in first out approach
    Stack<String> fruits = new Stack<>();

    //add elements on top using push()
    fruits.push("apple");
    printStackElements(fruits);

    fruits.push("banana");
    fruits.push("carrot");
    fruits.push("Dragon fruit");

    //Check is Stack is Empty using
    System.out.println("Is Stack Empty: " + fruits.empty());

    //Get Stack size using size() which is provided by collection interface
    System.out.println("Size of Stack is : " + fruits.size());

    //Print Stack directly
    System.out.println("Elements of Stack: " + fruits);

    //Get top Element of stack using pop() method. This will remove element from stack. Raise  EmptyStackException – if this stack is empty. So always check empty first
    System.out.println("Top Element Poped from stack is :" + fruits.pop());

    System.out.println("Stack Elements after pop");
    printStackElements(fruits);

    //Get top element of stack without removing it from stack using peek()
    System.out.println("Current top element of stack is : " + fruits.peek());

    //Search for an element in stack
    System.out.println("banana is available at : " + fruits.search("banana"));

    //get Element at index
    System.out.println("Elements at index 2 is  :"+fruits.get(2));

  }

  //printing stack elements using iterator
  private static void printStackElements(Stack<String> fruits) {
    Iterator itr = fruits.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }


}
