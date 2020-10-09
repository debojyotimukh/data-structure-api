public class MyHashMap<K, V> {
    private UnorderedLinkedList<K> linkedList;

    public MyHashMap() {
        this.linkedList = new UnorderedLinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        return myMapNode == null ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.linkedList.append(myMapNode);
        } else myMapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{"+linkedList.toString()+"}";
    }
}
