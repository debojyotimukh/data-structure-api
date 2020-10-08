public class SortedList<T extends Comparable<T>> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int n;

    public SortedList() {
        head = null;
        tail = null;
        n = 0;
    }

    public void add(MyNode<T> newNode) {
        if (this.head == null)
            this.head = newNode;
        else if (newNode.compareTo(head) < 0) {
            INode<T> temp = this.head;
            this.head = newNode;
            head.setNext(temp);
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < n - 1; i++) {
                if (newNode.compareTo(current) > 0 && newNode.compareTo(current.getNext()) < 0)
                    break;
                current = (MyNode<T>) current.getNext();
            }
            MyNode<T> before=current;
            MyNode<T> after= (MyNode<T>) current.getNext();
            before.setNext(newNode);
            newNode.setNext(after);
        }
        n++;
    }

    public MyNode<T> pop() {
        if(size()==1){
            MyNode<T> temp=head;
            head=null;
            n--;
            return temp;
        }
        INode<T> current = head;
        for (int i = 0; i < n -2; i++)
            current = current.getNext();
        MyNode<T> temp = (MyNode<T>) current.getNext();
        current.setNext(null);
        tail = (MyNode<T>) current;
        n--;
        return temp;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n==0;
    }
    public void printList() {
        INode<T> current = head;
        for (int i = 0; i < n; i++) {

            System.out.println(i + " " + current.getKey());
            current = current.getNext();
        }
    }
}
