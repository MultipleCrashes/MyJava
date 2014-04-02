import java.io.*;

class link
{
link next;
int val;
link(int data)
{
 val=data;
}

//public void displayLink()
//{
//System.out.println("This node has value "+data);
//}

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
//newlink.displayLink();
System.out.println("Successfully Inserted Data "+data);
}
}


public class LinkListApp
{
public static void main(String args[]) throws IOException
{
System.out.println("Inside Linked List App");
LinkList obj=new LinkList();
obj.append(10);

}
}


