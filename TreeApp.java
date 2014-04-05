import java.io.*;

class Node
{
Node left;
Node right;
int val;
 Node(int data)
 {
 val=data;
 }

  public void displayNode()
  {
  System.out.println(val);
  }
}

class TreeNode
{

 Node root;
 TreeNode()
 {
 root=null;
 }
 
  public void addNode(int data)
  {
  Node newNode=new Node(data);
  System.out.println("Successfully added node with value to the tree -> "+data);
    
  if(root==null)
    {
      root=newNode;
    }
    else
    {
    Node current=newNode;
    Node parent;
    while(true)
    {
       parent=current;
       if(newNode.val<parent.val)
       {
       // Traverse Left 
       current=current.left;
         if(current==null)
         { 
         parent.left=newNode;
         return;
         }
       }

       if(newNode.val>parent.val)
       {
       current=current.right;
        if(current==null)
        {
         parent.right=newNode;
         return;
        }
       }    
     }  //while ends   
   } // else ends
 }  //Insert function ends
} //class ends

public class TreeApp
{
public static void main(String args[]) throws IOException
{
System.out.println("Main Class execution ");
TreeNode obj=new TreeNode();
obj.addNode(10);

}
}
 



