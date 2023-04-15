import java.util.Arrays;
import java.util.Collection;
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
// Add items from a collection into Array List
    public void addAll(Collection<? extends T> collection) {
        // Iterate over the items in collection using foreach loop
        for (T item : collection) {
            // Call the add method for each item from collection
            add(item);
        }
    }

    // Add item in specific location (index)
    public void add(T item, int index) {
        // Check if index is out of range
        if (index < 0 || index > _length)
            // Throw an exception
            throw new IndexOutOfBoundsException();

        // Check if internal array is full
        if (_length == _hiddenArr.length)
            // Doubling its size if its full
            increaseArray();

        // Shift all elements to the right from index
        for (int i = _length; i > index; i--) {
            _hiddenArr[i] = _hiddenArr[i - 1];
        }

        // Put item inside internal array
        _hiddenArr[index] = item;

        // Incrementing length of Array List
        _length++;
    }

    // Replace item in specific location (index)
    public void replace(T item, int index) {
        // Check if the index is out of range
        if (index >= _length)
            // Throw an exception
            throw new IndexOutOfBoundsException();

        // Replace the item in internal array
        _hiddenArr[index] = item;
    }

    // Get item at specific location (index)
    public T get(int index) {
        // Check if the index is out of range
        if (index >= _length)
            throw new IndexOutOfBoundsException();

        // Return item at specific location
        return _hiddenArr[index];
    }

    // Get size of Array List
    public int size() {
        // Return length of Array List
        return _length;
    }

    // Index of specific item if found in Array List
    public int indexOf(T item) {
        // Iterate over the items in Array List
        for (int i = 0; i < _length; i++) {
            // Check if each item is equal to given item
            if (_hiddenArr[i].equals(item))
                // Return the index of given item
                return i;
        }

        // Return -1 if given item was not found
        return -1;
    }
}
