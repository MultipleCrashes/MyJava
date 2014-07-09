//Generic Class  - Allows Data to be initialized during compile time 

// Should use object data type 
// The List is a place holder to allow to wait for the compile 
// Type place holder 
public class List<T>
    {
    private T[] datastore;  // place holder type is array
    private int size;
    private int pos;

    public List(int numElements){    //constructor 
    size=numElements;
    pos=0;
    datastore=(T[]) new Object[size];  //object array cast to array type 
    }

    public void add(T element) {
      datastore[pos]=element;
      ++pos;
      }

   public String toString(){      // overridding to string function
     String elements="";
     for(int i=0;i<pos;++i){
        elements+=datastore[i]+" ";
      }
      return elements;
      }



}
