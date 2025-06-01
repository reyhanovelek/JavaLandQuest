package com.codeland;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.codeland.HeroEligibilityChecker;

public class HeroEligibilityCheckerTest {

    @Test
    public void testEligibility() {
        assertTrue(HeroEligibilityChecker.isEligible(25, 80));
        assertFalse(HeroEligibilityChecker.isEligible(16, 90));
        assertFalse(HeroEligibilityChecker.isEligible(20, 50));
    }

    @Test
    public void testHeroRank() {
        assertEquals("Warrior", HeroEligibilityChecker.getHeroRank(60));
        assertEquals("Apprentice", HeroEligibilityChecker.getHeroRank(30));
    }
}
