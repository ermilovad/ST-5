package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalcForTwo() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcForNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcForZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcForSmallValue() {
        Sqrt sqrt = new Sqrt(0.000001);
        assertEquals(Math.sqrt(0.000001), sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcForLargeValue() {
        Sqrt sqrt = new Sqrt(1_000_000);
        assertEquals(1000.0, sqrt.calc(), 1e-4);
    }

    @Test
    public void testAverageSimple() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), 1e-4);
    }

    @Test
    public void testAverageWithZero() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.average(0.0, 2.0), 1e-4);
    }

    @Test
    public void testGoodTrueCase() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodFalseCase() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(1.0, 4.0));
    }

    @Test
    public void testImproveIncreasesAccuracy() {
        Sqrt sqrt = new Sqrt(9.0);
        double improved = sqrt.improve(2.0, 9.0);
        assertTrue(improved > 2.0 && improved < 3.5);
    }

    @Test
    public void testIterApproachesRoot() {
        Sqrt sqrt = new Sqrt(16.0);
        double result = sqrt.iter(1.0, 16.0);
        assertEquals(4.0, result, 1e-4);
    }

    @Test
    public void testIterWithCloseGuess() {
        Sqrt sqrt = new Sqrt(25.0);
        double result = sqrt.iter(5.1, 25.0);
        assertEquals(5.0, result, 1e-4);
    }

    @Test
    public void testCalcNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(5.0);
        assertEquals(Math.sqrt(5.0), sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcForDecimal() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcEdgePrecision() {
        Sqrt sqrt = new Sqrt(123456.789);
        assertEquals(Math.sqrt(123456.789), sqrt.calc(), 1e-4);
    }
}
