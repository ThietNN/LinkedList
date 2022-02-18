public class Main {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList sample = new MyLinkedList(10);
        sample.addFirst(11);
        sample.addFirst(12);
        sample.addFirst(13);

        sample.add(4,9);
        sample.add(6,7);
        sample.add(10,10);
        sample.printList();
    }
}
