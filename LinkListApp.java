import java.io.*;
class link
{
 link next;
 int val;
 link(int data)
 {
 val=data;
 }

 public void displayLink()
 {
 System.out.println(val);
 }
}

class LinkList
{
 link first;
 LinkList()
 {
 first=null;
 }

 public void append(int data)
 {
 link newlink=new link(data);
 newlink.next=first;
 first=newlink;
 System.out.println("Successfully Inserted Data "+data);
 }

 public void displayLinkList()
 {
 System.out.println("\n\nDisplaying all the inserted data\n\n");
 link current=first;
  while(current!=null)
  {
  current.displayLink();
  current=current.next;
  }
 }
}


public class LinkListApp
{
 public static void main(String args[]) throws IOException
 {
 System.out.println("Inside Linked List App");
 LinkList obj=new LinkList();
 obj.append(10);
 obj.append(20);
 obj.append(5);
 obj.append(4);
 for(int i=0;i<=10;i++)
   obj.append(i);

 obj.displayLinkList();

 }
}


