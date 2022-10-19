package io.github.ioni5;

public class PersistenceSalesService implements ISalesService {

    private SalesService salesService = new SalesService();

    private SalesRepository salesRepository;

    public PersistenceSalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public String fizzbuzz(int number) {
        String result = salesService.fizzbuzz(number);
        salesRepository.saveResult(number, result);
        return result;
    }
    
}
