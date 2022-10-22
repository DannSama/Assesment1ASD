public class Main {
    public static void main(String[] args) {

        //nomer 1
        LinkedList<Integer> list = new LinkedList<Integer>();
        //nomer 2
        list.addFirst(7);
       //nomer 3
        list.addFirst(5);
       // nomer 4
        list.addlast(8);
       // nomer 5
        list.addlast(10);
       // nomer 6
        list.addFirst(list.get(0) + list.get(1) + list.get(2) + list.get(3));
        //nomer 7
        list.removefirst();
        //nomer 8
        list.removeLast();
        //nomer 9
        list.display();
    }
}
