/**
 * Node Class
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class Node {

 //data members
 private String data;
 private Node next;

 //constructor
 public Node() {
  this.data = "";
  this.next = null;
 }
 
 public Node(String data) {
  this.data = data;
  next = null;
 }

  //methods
 public String getData() {
  return data;
 }

 public void setData(String data) {
  this.data = data;
 }

 public Node getNext() {
  return next;
 }

 public void setNext(Node next) {
  this.next = next;
 }

 public String toString() {
  String text = "This node is empty.";
  if (data != null)
   text = "Node data: " + data;
  return text;
 }
}