import org.junit.Assert;
import org.junit.Test;

public class MyMyLinkedListTest {
    @Test
    public void threeNumbersAfterAddShouldBeOnTop(){
        MyNode<Integer> first=new MyNode<>(70);
        MyNode<Integer> second=new MyNode<>(30);
        MyNode<Integer> third=new MyNode<>(56);
        MyLinkedList<Integer> linkedList=new MyLinkedList<>();
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        Assert.assertEquals(first,linkedList.pop());
    }

    @Test
    public void threeNumbersAfterAppendShouldBeOnTop(){
        MyNode<Integer> first=new MyNode<>(56);
        MyNode<Integer> second=new MyNode<>(30);
        MyNode<Integer> third=new MyNode<>(70);
        MyLinkedList<Integer> linkedList=new MyLinkedList<>();
        linkedList.append(first);
        linkedList.append(second);
        linkedList.append(third);
        Assert.assertEquals(first,linkedList.pop());

    }
}
