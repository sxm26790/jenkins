package com.geekcap.vmturbo;

/**import org.junit.Assert;
import org.junit.Test;
*/
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by shaines on 7/24/16.
 */
/**public class ThingTest {

    *@Test
   * public void testN() {
        *Thing t = new Thing();
        *t.setN(5);
        *Assert.assertEquals("N should be 5", 5, t.getN());
    *}
*} */
public class Thing {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}

