public class MyQueue<T extends Comparable<T>> {
    private UnorderedLinkedList<T> list;

    public MyQueue() {
        list=new UnorderedLinkedList<>();
    }

    public void enque(MyNode<T> newNode) {
        list.add(newNode);
    }


    public MyNode<T> deque() {
        return (MyNode<T>) list.pop();
    }
}
