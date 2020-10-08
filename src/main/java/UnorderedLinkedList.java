public class UnorderedLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    private int n;

    public UnorderedLinkedList() {
        head = null;
        tail = null;
        n = 0;
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

    public void remove(K key) {
        if(!search(key))
            return;
        int indexOfKey=index(key);
        INode<K> before,after;
        INode<K> current=head;
        for (int i=0;i<indexOfKey-1;i++){
            current=current.getNext();
        }
        before=current;
        current=current.getNext();
        after=current.getNext();
        before.setNext(after);
        current.setNext(null);
        n--;
    }

    public boolean search(K key) {
        INode<K> current=head;
        for(int i=0;i<n;i++){
            if(current.getKey().equals(key))
                return true;
            current=current.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return n;
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

    public int index(K key){
        INode<K> current=head;
        for(int i=0;i<n;i++){
            if(current.getKey().equals(key))
                return i;
            current=current.getNext();
        }
        return -1;
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

    public void insertAfter(K key, INode<K> newNode) {
        int pos=-1;
        if(search(key))
            pos=index(key);
        insert(pos+1, newNode);
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

    public INode<K> popLast() {
        INode<K> temp = head;
        head = head.getNext();
        //temp.setNext(null);
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
