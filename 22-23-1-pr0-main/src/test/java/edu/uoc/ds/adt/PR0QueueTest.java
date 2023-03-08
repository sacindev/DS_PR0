package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {


        this.pr0q.fillQueue();
        assertEquals(Integer.valueOf(this.pr0q.getQueue().size()), Integer.valueOf(this.pr0q.CAPACITY));
        Integer valueToCompare = 129;
        assertEquals(this.pr0q.clearFullQueue(), valueToCompare);

        assertEquals(Integer.valueOf(this.pr0q.getQueue().size()), Integer.valueOf(0));
    }

}
