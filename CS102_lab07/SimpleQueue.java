/**
 * Simple Queue Class
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class SimpleQueue {
  //data members
 private SimpleLinkedList list;

 //constructor
 public SimpleQueue() {
  list = new SimpleLinkedList();
 }

  //methods
 public void enqueue(String data) {
  list.addToTail(data);
 }

 public String dequeue() {
  return list.removeFromHead();
 }

 public boolean isEmpty() {
  if (list.isEmpty())
   return true;
  else
   return false;
 }

 public String toString() {
  return list.toString();
 }

}