public class MyStack<K extends Comparable<K>> {
    private UnorderedLinkedList<K> list;

    public MyStack() {
        this.list = new UnorderedLinkedList<>();
    }

    public void push(INode<K> newNode) {
        list.add(newNode);
    }

    public INode<K> pop() {
        if (list.isEmpty()) return null;
        return list.popLast();
    }


    public INode<K> peek() {
        if (list.isEmpty()) return null;
        INode<K> temp = list.popLast();
        list.add(temp);
        return temp;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}