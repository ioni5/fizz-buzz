package io.github.ioni5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SalesServiceTest {

    private SalesService salesService;

    @BeforeEach
    public void init() {
        salesService = new SalesService();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    public void fizzbuzz_receivesNumberLessThan0_returnAssert(int number) {
        assertThrows(AssertionError.class, () -> salesService.fizzbuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void fizzbuzz_receivesMultipleOf3And5_returnFizzBuzz(int number) {
        assertEquals("FizzBuzz", salesService.fizzbuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    public void fizzbuzz_receivesMultipleOf3_returnFizz(int number) {
        assertEquals("Fizz", salesService.fizzbuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    public void fizzbuzz_receivesMultipleOf5_returnBuzz(int number) {
        assertEquals("Buzz", salesService.fizzbuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void fizzbuzz_receivesNoMultipleOf3Or5_returnSameNumberAsString(int number) {
        assertEquals(Integer.toString(number), salesService.fizzbuzz(number));
    }
    
}
