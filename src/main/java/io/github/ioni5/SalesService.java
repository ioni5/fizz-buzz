package io.github.ioni5;

public class SalesService implements ISalesService {
    
    @Override
    public String fizzbuzz(int number) {
        assert number > 0;
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
