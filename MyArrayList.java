import java.util.*;
public class MyArrayList<E> implements List<E>{
  private Object[] elements;
  private int size;
  
public MyArraylist(){
  // This is an implementation of a custom ArrayList called MyArrayList that implements the List interface.
  elements = new Object[10];
  size = 0;
}
 private void resize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

 // Testing the implementation
    public static void main(String[] args) {
        
 }
}
