import java.io.*;

class First
{
public void name()
{
  System.out.println("My Name is Harish");
  System.out.println("calling method of second class,Note that if the classes are declared as public then they need to be kept in seperate java files");
}
}


class MultipleClassesInSameFunction
{
public static void main(String args[]) throws IOException
{
System.out.println("Now calling second function");
First obj=new First();
obj.name();
}
}

