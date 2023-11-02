package LinearStructures;
import java.util.Random;
public class IntVector{

    private final static int INITIAL_CAPACITY = 10;
    private int[] arr = new int[INITIAL_CAPACITY];
    private int size = 0;

    //default constructor
    public IntVector() { }

    //overloaded constructor
    public IntVector(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException();
        }
        arr = new int[capacity];
    }

    //returns function size
    public int size(){return size;}

    //CRUD (Create, Read, Update, Delete)operations (this is 90% of business)

    private void testBounds(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    private void tryResize(){
        if(size >= arr.length - 1){//reached array end
                //temp array thats larger than original
                int[] temp = new int[1 + arr.length * 2];

                //copy into temp array
                for(int i = 0; i < size; i++){
                    temp[i] = arr[i];
                }
                //set old arrary = temp array
                arr = temp;
        }
    }

    public void add(int n){
        tryResize(); //guarnatee capacity first
        arr[size++] = n;
    }

    public int get(int index){
        testBounds(index);
        return arr[index];

    }

    public void clear(){
        arr = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void set(int index, int value){
        testBounds(index);
        arr[index] = value;
    }

    Random rand = new Random();
    /**
    *Insert the element at 'index' = 'value'
    *Shift other elements to the right
    *Returns 'true' if value was successfully inserted, 'false' otherwise
    *@param index The position in which the value will be inserted
    *@param value THe numerical value to be added
    */

    public boolean add(int index, int value) {
        testBounds(index);
        tryResize();
        for(int i = size; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;
        return true;
    }
    /**
    *Removes first instance of 'value' found in the list
    *Returns 'true' if value was successfully inserted, 'false' otherwise
    *@param value THe numerical value to be added
    */
    public boolean remove(int value) {
        boolean a = false;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] == value || a){
                a = true;
                arr[i] = arr[i+1];
            }
        }
        if(a) size--;
        return a;
    }

    @Override
    public String toString(){
        if(size == 0) return "[]"; //empty array
        String t = "[" + arr[0];
        for(int i = 1; i < size; i++){
            t += ", " + arr[i];
        }
        return t + "]";
    }
}

