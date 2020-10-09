public class MyBinaryTree<T extends Comparable<T>> {
    private MyBinaryNode<T> root;
    private int n;

    public MyBinaryTree() {
        this.root=null;
        n=0;
    }

    private MyBinaryNode<T> add(MyBinaryNode<T> current,T key){
        if(current==null)
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult<0)
            current.left=add(current.left,key);
        else if(compareResult>0)
            current.right=add(current.right,key);
        return current;
    }

    public void add(T key) {
        n++;
        this.root=this.add(root,key);
    }

    public int getSize() {
        return n;
    }

    private MyBinaryNode<T> search(MyBinaryNode<T> current,T key){
        if(current==null)
            return null;
        int compareResult=key.compareTo(current.key);
        if(compareResult<0)
            return search(current.left,key);
        else if(compareResult>0)
            return search(current.right,key);
        return current;
    }

    public boolean search(T key){
        MyBinaryNode<T> searchResultNode=search(root,key);
        return searchResultNode!=null;
    }
}
