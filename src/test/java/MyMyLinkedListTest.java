import org.junit.Assert;
import org.junit.Test;

public class MyMyLinkedListTest {
    @Test
    public void threeNumbersAfterAddShouldBeOnTop(){
        MyNode<Integer> first=new MyNode<>(56);
        MyNode<Integer> second=new MyNode<>(35);
        MyNode<Integer> third=new MyNode<>(70);
        MyLinkedList<Integer> linkedList=new MyLinkedList<>();
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        Assert.assertEquals(Integer.valueOf(56),linkedList.pop().getKey());
    }
}
