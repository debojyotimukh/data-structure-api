import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {
    MyBinaryTree<Integer> bst;
    @Before
    public void init(){
        bst=new MyBinaryTree<>();
    }
    @Test
    public void sizeTest(){
        bst.add(56);
        bst.add(30);
        bst.add(70);
        Assert.assertEquals(3,bst.getSize());
    }

    @Test
    public void sizeTest2(){
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(30);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(16);
        bst.add(3);
        bst.add(65);
        bst.add(67);
        bst.add(63);

        Assert.assertEquals(14,bst.getSize());

    }
}
