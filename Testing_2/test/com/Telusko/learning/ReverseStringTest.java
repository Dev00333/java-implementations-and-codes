package com.Telusko.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    @Test
    void shouldReverseString() {
        ReverseString rs = new ReverseString();
        assertEquals("olleh", rs.reverseString("hello"));
        assertEquals("alol", rs.reverseString("lola"));
        assertEquals("neila", rs.reverseString("alien"));
    }
}