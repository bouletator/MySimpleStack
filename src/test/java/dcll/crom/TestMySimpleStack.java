package dcll.crom;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by clement on 17/02/16.
 */
public class TestMySimpleStack {
    @Test
    public void testIsEmpty(){
        MySimpleStack mss = new MySimpleStack();
        assertTrue(mss.isEmpty());
    }

    @Test
    public void testNotEmpty(){
        MySimpleStack mss = new MySimpleStack();
        mss.push(new Item());
        assertFalse(mss.isEmpty());
    }

    @Test
    public void testGetSize(){
        MySimpleStack mss = new MySimpleStack();
        assertEquals(mss.getSize(),0);
    }

    @Test
    public void testGetSizeMoreItem(){
        MySimpleStack mss = new MySimpleStack();
        mss.push(new Item());
        mss.push(new Item());
        assertEquals(mss.getSize(),2);
    }

    @Test
    public void testPushNotNullItem(){
        MySimpleStack mss = new MySimpleStack();
        mss.push(new Item());
        assertEquals(mss.getSize(),1);
    }

    @Test
    public void testPushNullItem(){
        MySimpleStack mss = new MySimpleStack();
        mss.push(null);
        assertEquals(mss.getSize(),1);
    }

    @Test
    public void testPeek(){
        MySimpleStack mss = new MySimpleStack();
        Item i = new Item();
        mss.push(i);
        assertEquals(mss.getSize(),1);
        assertEquals(i,mss.peek());
        assertEquals(mss.getSize(),1);
    }

    @Test (expected = EmptyStackException.class)
    public void testEmptyStackPeek(){
        MySimpleStack mss = new MySimpleStack();
        mss.peek();
    }

    @Test
    public void testPop(){
        MySimpleStack mss = new MySimpleStack();
        Item i = new Item();
        mss.push(i);
        assertEquals(mss.getSize(),1);
        assertEquals(mss.pop(),i);
        assertEquals(mss.getSize(),0);
    }

    @Test (expected = EmptyStackException.class)
    public void testStackEmptyPop(){
        MySimpleStack mss = new MySimpleStack();
        mss.pop();
    }

}
