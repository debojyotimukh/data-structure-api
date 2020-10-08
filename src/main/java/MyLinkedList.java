public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    private int n;

    public MyLinkedList() {
        head = null;
        tail = null;
        n = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return n;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> temp = this.head;
            this.head = newNode;
            head.setNext(temp);
        }
        n++;
    }

    public void append(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> temp = this.tail;
            this.tail = newNode;
            temp.setNext(tail);
        }
        n++;
    }

    public void insert(int pos, INode<K> item) {
        if (pos < 0 || pos > size()) return;
        if (isEmpty()) add(item);
        else if (pos == 0) add(item);
        else if (pos == size()) append(item);
        else {
            INode<K> current;
            current = head;
            for (int i = 1; i < pos; i++)
                current = current.getNext();
            item.setNext(current.getNext());
            current.setNext(item);
            n++;
        }
    }

    public INode<K> popLast() {
        INode<K> temp = head;
        head = head.getNext();
        //temp.setNext(null);
        n--;
        return temp;
    }

    public INode<K> pop() {
        INode<K> current = head;
        for (int i = 0; i < n - 2; i++)
            current = current.getNext();
        INode<K> temp = tail;
        current.setNext(null);
        tail = current;
        n--;
        return temp;
    }

    public void printList() {
        INode<K> current = head;
        for (int i = 0; i < n; i++) {

            System.out.println(i + " " + current.getKey());
            current = current.getNext();
        }
    }
}
