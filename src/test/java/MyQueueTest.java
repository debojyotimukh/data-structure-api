import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void enqueueOrderTest(){
        MyNode<Integer> first=new MyNode<>(70);
        MyNode<Integer> second=new MyNode<>(30);
        MyNode<Integer> third=new MyNode<>(56);
        MyQueue<Integer> queue=new MyQueue<>();
        queue.enque(first);
        queue.enque(second);
        queue.enque(third);
        Assert.assertEquals(first,queue.deque());
        Assert.assertEquals(second,queue.deque());
        Assert.assertEquals(third,queue.deque());

    }
}
