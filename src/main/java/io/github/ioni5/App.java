package io.github.ioni5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new UserService(new SalesService()).fancyBusiness(15));
    }
}
