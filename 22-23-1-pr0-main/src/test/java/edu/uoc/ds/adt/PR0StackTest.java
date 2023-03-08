package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        this.pr0q.fillStack();
        assertEquals(Integer.valueOf(this.pr0q.getStack().size()), Integer.valueOf(this.pr0q.CAPACITY));
        Integer valueToCompare = 129;
        assertEquals(this.pr0q.clearAllStack(), valueToCompare);

        assertEquals(Integer.valueOf(this.pr0q.getStack().size()), Integer.valueOf(0));
    }
}
