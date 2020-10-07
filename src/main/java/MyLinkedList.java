public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
    }

    public void add(INode<K> newNode){
        if(this.tail==null)
            this.tail=newNode;
        if(this.head==null)
            this.head=newNode;
        else {
            INode<K> temp=this.head;
            this.head=temp;
            head.setNext(temp);
        }
    }

    public void append(INode<K> newNode){
        if(this.tail==null)
            this.tail=newNode;
        if(this.head==null)
            this.head=newNode;
        else {
            INode<K> temp=this.tail;
            this.tail=temp;
            tail.setNext(temp);
        }
    }

    public INode<K> pop(){
        INode<K> temp=this.head;
        this.head=temp.getNext();
        return temp;
    }
}
