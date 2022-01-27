/**
 * Simple Linked List class.
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class SimpleLinkedList {
  //data members
 private Node head;
 private Node tail;

 //constructor
 public SimpleLinkedList() {
  head = null;
  tail = head;
 }

  //methods
 public void addToTail(String data) {

  Node node = new Node(data);

  if (head == null) {
   head = node;
   tail = node;
  } 
  else {
    tail.setNext(node);
    tail = node;
  }
 }

 public String removeFromHead() {
  String str = head.getData();
  if (head.getData() == null)
   return "";
  else
   head = head.getNext();
  return str;
 }

 public boolean isEmpty() {
  if (head == null)
   return true;
  else
   return false;
 }

 public Node get(String data) {
  Node iter = head;

  while (iter != null && !iter.getData().equals(data))
   iter = iter.getNext();
  return iter;
 }

 public String toString() {
  String text = "";
  if (!isEmpty()) {
   Node iter = head;
   while (iter.getNext() != null) {
    text += iter.getData();
    text += "\n";
    iter = iter.getNext();
   }
   text = text + iter.getData();
  }
  return text;
 }
}