package cc.protea.mathexample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
    public void testApp()
    {
        assertEquals( 7, cc.protea.mathlib.Math.add(3, 4) );
    }
}
