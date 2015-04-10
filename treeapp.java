import java.io.*;


class node
{
  node left;
  node right;
  int data;
  node(int data){
	this.data=data;
    }
}


class TreeAppl
 {
   node root=null;
   node head=null;
	public void appendNode(int data)
	{	
		node nn=new node(data);
		System.out.println("New Node Created "+nn.data);
		if(root==null)
		{ 
		System.out.println("No node present .Adding root ---->");
		root=nn;
                root.right=null;
		root.left=null;
		head=nn;
		head.right=null;	
		head.left=null;
		}
		else
		{	
		System.out.println("Root Node is present ,hence creating new node");
                node temp=head;
  		while(temp!=null){
 				System.out.println("DATA --->"+temp.data);
				if(data<temp.data)
					{	
					temp=temp.left;
					}
				if(data>temp.data)
					{
					temp=temp.right;
					}
                              }		
			      temp=nn;
		}      
   }
}

public class treeapp
	{
	public static void main(String args[]) throws IOException
		{
		System.out.println("This is harish");
		TreeAppl obj=new TreeAppl();
		obj.appendNode(10);
		obj.appendNode(20);
		obj.appendNode(30);
                
		}

       }
	
