package test.java.hw3;

import main.java.hw3.MainHW;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW hw = new MainHW();

    @Test
    @DisplayName("Проверка метода EvenNumber (число четное")
    void isEvenNumberTrue() {
        assertTrue(hw.evenOddNumber(0));
    }

    @Test
    @DisplayName("Проверка метода EvenNumber (число нечетное")
    void isEvenNumberFalse() {
        assertFalse(hw.evenOddNumber(-1));
    }

    @Test
    @DisplayName("Проверка метода isNumberInRange (число в диапазоне минимальное")
    void isNumberInRangeTrueMin() {
        assertTrue(hw.numberInInterval(25));
    }

    @Test
    @DisplayName("Проверка метода isNumberInRange (число в диапазоне максимальное")
    void isNumberInRangeTrueMax() {
        assertTrue(hw.numberInInterval(100));
    }

    @Test
    @DisplayName("Проверка метода isNumberInRange (число меньше диапазона")
    void isNumberInRangeFalseMin() {
        assertFalse(hw.numberInInterval(24));
    }

    @Test
    @DisplayName("Проверка метода isNumberInRange (число больше диапазона")
    void isNumberInRangeFalseMax() {
        assertFalse(hw.numberInInterval(101));
    }
}
