package org.sever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.sever.day02.divise;

class day02Test {

    @Test
    void divise1() {
        assertEquals(12,divise(3,14));
    }
}