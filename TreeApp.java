import java.io.*;

class Node
{
Node left;
Node right;
Node val;
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
  System.out.print("Successfully added node with value %d to the tree "+data);
  if(root==null)
    {
      root=newNode;
    }
     
     }    
   }


public class TreeApp
{
public static void main(String args[]) throws IOException
{
System.out.println("Main Class execution ");
}
}
 



