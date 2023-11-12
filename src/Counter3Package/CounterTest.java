package Counter3Package;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CounterTest {

    @Test
    public void lineCounter(){
        Counter user = new Counter(0,0,"stop");
        int expected = 0;
        int actual = user.getLine();
        assertEquals(expected,actual);
    }
    @Test
    public void characterCounter(){
        Counter user = new Counter(0,0,"stop");
        int expected = 0;
        int actual = user.getCharacter();
        assertEquals(expected,actual);
    }
    @Test
    public void textCounter(){
        Counter user = new Counter(0,0,"stop");
        String expected = "stop";
        String actual = user.getText();
        assertEquals(expected,actual);
    }
}
