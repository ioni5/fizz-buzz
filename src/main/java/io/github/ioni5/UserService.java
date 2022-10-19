package io.github.ioni5;

public class UserService {

    private ISalesService salesService;

    public UserService(ISalesService salesService) {
        this.salesService = salesService;
    }

    public String fancyBusiness(int number) {
        String ans = salesService.fizzbuzz(number);
        switch (ans) {
            case "FizzBuzz":
            case "Fizz":
            case "Buzz":
                return ans;
            default: 
                return Integer.parseInt(ans) % 2 == 0 ? "Baz" : "Cat";
        }
    }
}
