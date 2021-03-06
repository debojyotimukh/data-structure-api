public class MyNode<K extends Comparable<K>> implements INode<K>,Comparable<K>{
    private K key;
    private INode<K> next;

    public MyNode(K key) {
        this.key = key;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    @Override
    public INode<K> getNext() {
        return this.next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next=next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("MyNode{key=").append(key).append("}");
        if(next!=null) stringBuilder.append("->").append(next.getKey());
        return stringBuilder.toString();
    }


    @Override
    public int compareTo(K o) {
        return getKey().compareTo(o);
    }

    public int compareTo(INode<K> other){
        return this.getKey().compareTo(other.getKey());
    }
}
