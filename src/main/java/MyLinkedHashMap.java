import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
    private final int numBuckets;
    ArrayList<UnorderedLinkedList<K>> bucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.bucketArray = new ArrayList<>(numBuckets);
        //create empty linked lists
        for (int i = 0; i < numBuckets; i++)
            this.bucketArray.add(null);

    }

    //implement hash function
    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % numBuckets;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        UnorderedLinkedList<K> linkedList = this.bucketArray.get(index);
        if (linkedList == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
        return myMapNode == null ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        UnorderedLinkedList<K> linkedList = this.bucketArray.get(index);
        if (linkedList == null) {
            linkedList = new UnorderedLinkedList<>();
            this.bucketArray.set(index, linkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            linkedList.append(myMapNode);
        } else myMapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "MyLinkedHashMap List"+bucketArray.toString()+"}";
    }
}
