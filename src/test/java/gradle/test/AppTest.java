/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testAppHasAGreeting2() {
        App classUnderTest = new App();
        assertEquals("Hello world.", classUnderTest.getGreeting());
    }

    @Test public void testAppHasGet12() {
        App classUnderTest = new App();
        assertEquals(1, classUnderTest.get1());
    }
}
