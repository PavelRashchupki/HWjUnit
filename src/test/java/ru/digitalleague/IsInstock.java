package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsInstock {
    @Before
    public void setObject() {
        Storage.addObject("pear", 1);
    }

    @Test
    public void IsInStock1() {
        assertTrue(Storage.isInStock("pear"));
    }

    @Test
    public void IsInStock2() {
        assertFalse(Storage.isInStock("orange"));
    }
}

