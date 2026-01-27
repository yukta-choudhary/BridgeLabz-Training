package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.ListManager;

import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    ListManager lm = new ListManager();
    List<Integer> list = new ArrayList<>();

    @Test
    void testAddElement() {
        lm.addElement(list, 10);
        assertEquals(1, lm.getSize(list));
    }

    @Test
    void testRemoveElement() {
        lm.addElement(list, 20);
        lm.removeElement(list, 20);
        assertEquals(0, lm.getSize(list));
    }
}
