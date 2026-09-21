package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    // ===== isEven =====

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);
        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);
        assertFalse(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    //для ifPrime
    @Test
    void returnsFalseForNumberLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(100));
    }

    @Test
    void returnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49));
        assertFalse(CourseToolkit.isPrime(121));
    }

    //для isPalindrome

    @Test
    void returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("level"));
        assertTrue(CourseToolkit.isPalindrome("radar"));
    }

    @Test
    void returnsFalseForDifferentCase() {
        assertFalse(CourseToolkit.isPalindrome("Level"));
    }

    @Test
    void throwsForNullText() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
    }

    //для average

    @Test
    void returnsAverageForPositiveNumbers() {
        assertEquals(2.5, CourseToolkit.average(new int[]{1, 2, 3, 4}), 0.0001);
    }

    @Test
    void returnsAverageForNegativeNumbers() {
        assertEquals(-2.0, CourseToolkit.average(new int[]{-1, -2, -3}), 0.0001);
    }

    @Test
    void throwsForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(null);
        });
    }

    @Test
    void throwsForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(new int[]{});
        });
    }
}