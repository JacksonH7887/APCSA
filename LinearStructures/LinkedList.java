package LinearStructures;

public class LinkedList<E> {
    private int size = 0;

    private Node<E> head, tail;

    public LinkedList(){

    }

    public LinkedList(E[] objects){
        for(int i = 0; i < objects.length; i++){

        }
    }

    public void add(E e){
        add(size, e);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public int indexOf(E e){
        if(size == 0) return -1;

        int index = 0;
        Node<E> current = head;

        do {
            if(current.element == e) return index;
            current = current.next;
            index++;
        } while(current != null);

        return -1;
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if(tail == null) tail = head;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(tail == null) head = tail = newNode;
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void add(int index, E e){
        if(index == 0) addFirst(e);
        else if(index >= size) addLast(e);
        else{
            Node<E> current = head;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public void remove(int index){
    
    }

    public E getFirst(){
        if(size == 0) return null;
        return head.element;
    }

    public E lastIndexOf(){
        return tail.element;
    }



    public Node<E> get(int index){
        if(index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node<E>current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }


    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }

}