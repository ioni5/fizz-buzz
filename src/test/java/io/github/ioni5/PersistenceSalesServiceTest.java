package io.github.ioni5;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersistenceSalesServiceTest {
    
    @InjectMocks
    private PersistenceSalesService persistenceSalesService;

    @Mock
    private SalesRepository salesRepository;

    @RepeatedTest(10)
    public void fizzbuzz_getFizzBuzz_calledSaveResult(RepetitionInfo repetitionInfo) {
        int number = repetitionInfo.getCurrentRepetition();
        String result = persistenceSalesService.fizzbuzz(number);
        verify(salesRepository).saveResult(number, result);
    }
}
