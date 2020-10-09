public class MyStack<K extends Comparable<K>> {
    private UnorderedLinkedList<K> list;

    public MyStack() {
        this.list = new UnorderedLinkedList<>();
    }

    public void push(INode<K> newNode) {
        list.add(newNode);
    }

    public INode<K> pop() {
        return list.popLast();
    }


}