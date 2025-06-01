package com.codeland;
import com.codeland.PotionCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class PotionCalculatorTest {

    @Test
    public void testCalculateFullPotions() {
        assertEquals(3, PotionCalculator.calculateFullPotions(15));
        assertEquals(0, PotionCalculator.calculateFullPotions(2));
    }

    @Test
    public void testCalculateLeftoverUnits() {
        assertEquals(0, PotionCalculator.calculateLeftoverunits(15));
        assertEquals(0, PotionCalculator.calculateLeftoverunits(5));
    }


    @Test
    public void testTotalCost() {
        assertEquals(90, PotionCalculator.calculateTotalCost(30));
    }
}
