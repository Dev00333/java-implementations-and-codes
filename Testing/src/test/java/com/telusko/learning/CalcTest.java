package com.telusko.learning;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @org.testng.annotations.Test
    public void test() {
        Calc c=new Calc();
        int actual=c.div(10, 5);
        int expected=2;
        assertEquals(expected,actual);
    }
}
