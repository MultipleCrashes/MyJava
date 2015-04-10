import java.io.*;


public class constructorex
{
	int age;
	String name;
	constructorex(int a,String n)
	{
 	this.age=a;
	this.name=n;
	System.out.print(this.age);
	System.out.println(this.name);	
	}
	public static void main(String args[]) throws IOException
	{
	System.out.println("New class");
        constructorex obj=new constructorex(10,"updahyay");
	}
}
