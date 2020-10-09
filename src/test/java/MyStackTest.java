import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void stackPushPopTest(){
        MyNode<Integer> first=new MyNode<>(70);
        MyNode<Integer> second=new MyNode<>(30);
        MyNode<Integer> third=new MyNode<>(56);
        MyStack<Integer> stack=new MyStack<>();
        stack.push(first);
        stack.push(second);
        stack.push(third);
        Assert.assertEquals(third,stack.pop());
        Assert.assertEquals(second,stack.pop());
        Assert.assertEquals(first,stack.pop());
    }
}