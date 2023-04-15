import java.util.Arrays;
public class MyArrayList<T> {
    // _hiddenArr is the internal array to store all elements
    private T[] _hiddenArr;
    // _length is the actual number of elements in the internal array
    private int _length;

    // Default constructor that creates array with size 5
    public MyArrayList() {
        this(5);
    }

    // Overloaded constructor that allows to put specific size for array
    public MyArrayList(int initCapacity) {
        _hiddenArr = (T[])new Object[initCapacity];
    }

    // Private method that doubles the size of internal array when it becomes full
    private void increaseArray() {
        // Doubling the size
        int newSize = _hiddenArr.length * 2;
        _hiddenArr = Arrays.copyOf(_hiddenArr, newSize);
    }
  // Add a single item into Array List
    public void add(T item) {
        // Checks if Array List is full
        if (_length == _hiddenArr.length) {
            // Doubling its size if its full
            increaseArray();
        }

        // Add the item to the internal array
        _hiddenArr[_length++] = item;
    }
}
