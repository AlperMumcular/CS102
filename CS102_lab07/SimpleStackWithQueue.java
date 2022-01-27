/**
 * SimpleStackWithQueue Class
 * @author Alper Mumcular
 * @version 25/12/2020
 */
public class SimpleStackWithQueue {
//data members
 SimpleQueue q1;
 SimpleQueue q2;

 //constructor
 public SimpleStackWithQueue() {
  q1 = new SimpleQueue();
  q2 = new SimpleQueue();
 }

  //methods
 public void push(String data) {
  q2.enqueue(data);
  while (!q1.isEmpty())
   q2.enqueue(q1.dequeue());
  q1 = q2;
  q2 = new SimpleQueue();
 }

 public String pop() {
  return q1.dequeue();
 }

 public String toString() {
  return q1.toString();
 }
}