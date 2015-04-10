import java.io.*;


class link{
   int data;
   link next;
	link(int data)
	{
	this.data=data;
	}
}

class LinkedListApp
{
 link head=null;
 link first=null;

 public void displayLink()
 { 
 link itervar=first;
  while(itervar.next!=null)
	{
	System.out.println("DATA ->"+itervar.data);
	System.out.println("POINTER ->"+itervar.next);
	itervar=itervar.next;
	}
 
  }


 public void


 public void appendLink(int data)
 {
    
    link nl=new link(data);
    if(head==null)
	{
	System.out.println("head is null---------");
        first=nl;
        head=nl;
	head.next=null;
        }
    else
     {
      System.out.println("There are elements in the linked list");
      head.next=nl;
      head=head.next;
      head.next=null;
      } 
    
 }

}

public class LinkList
{
 public static void main(String args[]) throws IOException
 	{
	System.out.println("Inside Main class ");  
	LinkedListApp obj=new LinkedListApp();
	obj.appendLink(10);
	obj.appendLink(20);
	obj.appendLink(30);
	obj.appendLink(40);
        obj.displayLink();  
         }
}

