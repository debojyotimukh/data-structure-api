import org.junit.Assert;
import org.junit.Test;

public class SortedListTest {
    @Test
    public void sortedListOrderTest(){
        MyNode<Integer> node1=new MyNode<>(56);
        MyNode<Integer> node2=new MyNode<>(30);
        MyNode<Integer> node3=new MyNode<>(40);
        MyNode<Integer> node4=new MyNode<>(70);
        SortedList<Integer> sortedList=new SortedList<>();
        sortedList.add(node1);
        sortedList.add(node2);
        sortedList.add(node3);
        sortedList.add(node4);
        sortedList.printList();
        Assert.assertEquals(node4,sortedList.pop());
        Assert.assertEquals(node1,sortedList.pop());
        Assert.assertEquals(node3,sortedList.pop());
        Assert.assertEquals(node2,sortedList.pop());

    }
}
