/*
 * MathTest
 */
package gradle.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathTest {
    @Test public void testAdd() {
        Math m = new Math();
        assertEquals(2, m.add(1,1));
    }

    @Test public void testSub() {
        Math m = new Math();
        assertEquals(2, m.sub(1,1));
    }
}
