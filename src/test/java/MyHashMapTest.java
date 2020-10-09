import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void wordFrequencyTest(){
        final String uc1="To be or not to be";
        MyLinkedHashMap<String,Integer> hashMap=new MyLinkedHashMap<>();
        String[] words=uc1.split(" ");
        for(String word:words) {
            Integer value=hashMap.get(word.toLowerCase());
            if(value==null) value=1;
            else value++;
            hashMap.add(word.toLowerCase(), value);
        }
        Assert.assertEquals(Integer.valueOf(2),hashMap.get("be"));
    }
}
