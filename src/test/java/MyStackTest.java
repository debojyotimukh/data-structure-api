import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
    MyNode<Integer> first, second, third;
    MyStack<Integer> stack;

    @Before
    public void init() {
        first = new MyNode<>(70);
        second = new MyNode<>(30);
        third = new MyNode<>(56);
        stack = new MyStack<>();
    }

    @Test
    public void stackPushPopTest() {
        stack.push(first);
        stack.push(second);
        stack.push(third);
        Assert.assertEquals(third, stack.pop());
        Assert.assertEquals(second, stack.pop());
        Assert.assertEquals(first, stack.pop());
    }

    @Test
    public void stackPeekTest() {
        stack.push(first);
        stack.push(second);
        stack.push(third);
        Assert.assertEquals(third,stack.peek());
    }

    @Test
    public void stackSizeTest(){
        stack.push(first);
        stack.push(second);
        stack.push(third);
        Assert.assertEquals(3,stack.size());
        stack.peek();
        Assert.assertEquals(3,stack.size());
        stack.pop();
        stack.pop();
        Assert.assertEquals(first,stack.pop());
    }

    @Test
    public void stackEmptyTest(){
        stack.push(first);
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
        Assert.assertNull(stack.peek());
        Assert.assertNull(stack.pop());

    }
}