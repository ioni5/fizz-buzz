package io.github.ioni5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    
    @InjectMocks
    private UserService userService;

    @Mock
    private ISalesService salesService;

    @ParameterizedTest
    @ValueSource(strings = {"Fizz", "Buzz", "FizzBuzz"})
    public void fancyBusiness_getFizzBuzz_returnFizzBuzz(String expected) {
        Mockito.when(salesService.fizzbuzz(anyInt()))
        .thenReturn(expected);
        assertEquals(expected, userService.fancyBusiness(0));
    }
    
    @ParameterizedTest
    @CsvSource({
        "1, Cat",
        "2, Baz"
    })
    public void fancyBusiness_getNumberAsString_returnBazCat(String input, String expected) {
        Mockito.when(salesService.fizzbuzz(anyInt()))
        .thenReturn(input);
        assertEquals(expected, userService.fancyBusiness(0));
    }
}
