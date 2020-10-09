import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    final String UC1 = "To be or not to be";
    final String UC2="Paranoids are not paranoids "+
            "because they are paranoid but "+
            "because they keep putting themselves "+
            "deliberately into paranoid avoidable situations";

    private static MyLinkedHashMap<String,Integer> wordFrequencyMap(String sentence){
        MyLinkedHashMap<String, Integer> hashMap = new MyLinkedHashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            Integer value = hashMap.get(word.toLowerCase());
            if (value == null) value = 1;
            else value++;
            hashMap.add(word.toLowerCase(), value);
        }
        return hashMap;
    }

    @Test
    public void wordFrequencyTest() {

        MyLinkedHashMap<String, Integer> hashMap = wordFrequencyMap(UC1);

        Assert.assertEquals(Integer.valueOf(2), hashMap.get("be"));
    }

    @Test
    public void wordFrequencyInParagraphTest(){

        MyLinkedHashMap<String, Integer> hashMap = wordFrequencyMap(UC2);

        Assert.assertEquals(Integer.valueOf(2), hashMap.get("paranoid"));
        Assert.assertEquals(Integer.valueOf(2), hashMap.get("paranoids"));
    }

    @Test
    public void removeWordFromSentenceTest(){

        MyLinkedHashMap<String, Integer> hashMap = wordFrequencyMap(UC2);

        Assert.assertEquals(Integer.valueOf(1), hashMap.get("avoidable"));
        hashMap.remove("avoidable");
        Assert.assertNull(hashMap.get("avoidable"));
    }
}
