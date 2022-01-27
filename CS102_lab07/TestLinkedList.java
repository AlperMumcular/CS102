/**
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class TestLinkedList {
 public static void main(String[] args) {
  SimpleLinkedList list = new SimpleLinkedList();
  System.out.println("Empty list: ");
  System.out.println(list);

  System.out.println("\n Part 1 ");
  list.addToTail("node 1");
  list.addToTail("node 2");
  list.addToTail("node 3");
  list.addToTail("node 4");
  list.addToTail("node 5");
  list.addToTail("node 6");
  System.out.println(list);

  System.out.println("\n Part 2");
  System.out.println("Removed : " + list.removeFromHead());
  System.out.println("Removed : " + list.removeFromHead());
  System.out.println("Removed : " + list.removeFromHead());
  System.out.println("Now, list is:");
  System.out.println(list);

  System.out.println("\n Part 3 ");
  System.out.println(list.get("node 5"));
  System.out.println(list.get("node 7") + "\n");
  System.out.println(list);
 }
}