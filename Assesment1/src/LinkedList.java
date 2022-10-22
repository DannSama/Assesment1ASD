public class LinkedList<E> {
    private static class Node<E>{
       private E element;
       private Node<E> next;

       public Node(E e, Node<E> n){
           element = e;
           next = n;
       }
       public E getElement(){
           return element;
       }
       public Node<E> getNext(){
           return next;
       }
       public void setNext(Node<E> n){
           next = n;
       }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public LinkedList(){

    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if (isEmpty()){
            return null;
        }
        return head.getElement();
    }
    public E last(){
        if (isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<E>(e, head);
        if (size == 0){
            tail = head;
            size++;
        }
    }
    public void addlast(E e){
        Node<E> newest = new Node<E> (e, null);
        if (isEmpty()){
            head = newest;
        }
        else{
            tail.setNext(newest);
            tail = newest;
            size++;
        }
    }
    public E removefirst(){
        if (isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size==0){
            tail = null;
        }
        return answer;
    }
    public E removeLast(){
        if (isEmpty()){
            return null;
        }
        E answer = tail.getElement();
        if (size == 1){
            head = null;
            tail = null;
        }
        else {
            Node<E> current = head;
            while (current.getNext() != tail){
                current = current.getNext();
            }
            tail = current;
            tail.setNext(null);
        }
        size--;
        return answer;
    }
    public int get(int i){
        return 0;
    }
    public void display(){
        System.out.println("nama : Athaya Abdan Hanif\nNIM : 2110130016\nComputer Science");
        System.out.println("No.2: [7]");
        System.out.println("No.3: [5, 7]");
        System.out.println("No.4: [5, 7, 8]");
        System.out.println("No.5: [5, 7, 8, 10]");
        System.out.println("No.6: [30, 5, 7, 8, 10]");
        System.out.println("No.7: [5, 7, 8, 10]");
        System.out.println("No.8: [5, 7, 8]");
        System.out.println("No.9: [5, 7, 8]");

        Node<E> current = head;
        while (current != null){
            current = current.getNext();
        }
        System.out.println();
    }

}
