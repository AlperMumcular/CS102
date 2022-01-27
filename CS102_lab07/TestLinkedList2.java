/**
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class TestLinkedList2 {
 public static void main(String[] args) {
  SimpleStackWithQueue stack = new SimpleStackWithQueue();

  System.out.println("Empty stack: ");
  System.out.println(stack);

  System.out.println("\n Pushing items(1,2,3,4,5,6): ");  
  stack.push("item 1");
  stack.push("item 2");  
  stack.push("item 3");
  stack.push("item 4");
  stack.push("item 5");  
  stack.push("item 6");
  System.out.println(stack);

  System.out.println("\n Popping items: ");
  System.out.println("Popped : " + stack.pop());
  System.out.println("Popped : " + stack.pop() + "\n" );
  System.out.println("Result of pops:");
  System.out.println(stack);
 }
}