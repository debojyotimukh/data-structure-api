import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyUnorderedLinkedListTest {
    MyNode<Integer> first, second, third;
    UnorderedLinkedList<Integer> linkedList;

    @Before
    public void init() {
        first = new MyNode<>(70);
        second = new MyNode<>(30);
        third = new MyNode<>(56);
        linkedList = new UnorderedLinkedList<>();
    }

    @Test
    public void addOrderTest() {
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        Assert.assertEquals(first, linkedList.pop());
        Assert.assertEquals(second, linkedList.pop());
        Assert.assertEquals(third, linkedList.pop());


    }

    @Test
    public void appendOrderTest() {
        linkedList.append(first);
        linkedList.append(second);
        linkedList.append(third);
        Assert.assertEquals(first, linkedList.popLast());
        Assert.assertEquals(second, linkedList.popLast());
        Assert.assertEquals(third, linkedList.popLast());
    }

    @Test
    public void insertAtMiddleTest() {
        linkedList.append(first);
        linkedList.append(third);
        linkedList.insert(1, second);
        Assert.assertEquals(third, linkedList.pop());
        Assert.assertEquals(second, linkedList.pop());
        Assert.assertEquals(first, linkedList.pop());

    }

    @Test
    public void deleteLastTest() {
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        linkedList.popLast();
        Assert.assertEquals(second, linkedList.popLast());
    }

    @Test
    public void searchTest() {
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        Assert.assertEquals(second,linkedList.search(30));
        Assert.assertEquals(first,linkedList.search(70));
        Assert.assertEquals(third,linkedList.search(56));
    }

    @Test
    public void insertAfterTest() {
        MyNode<Integer> newNode=new MyNode<>(40);
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        linkedList.insertAfter(30,newNode);
        linkedList.pop();
        Assert.assertEquals(newNode,linkedList.pop());
    }

    @Test
    public void removeElementBySearchTest(){
        MyNode<Integer> newNode=new MyNode<>(40);
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        linkedList.insertAfter(30,newNode);
        linkedList.remove(40);
        Assert.assertNull(linkedList.search(40));
        Assert.assertEquals(3,linkedList.size());
    }
}
