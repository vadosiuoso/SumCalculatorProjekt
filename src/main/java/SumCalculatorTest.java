
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    SumCalculator sumCalculator;
    @BeforeEach
    public void createObject(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThatSumCalculatorWorksCorrect1(){

        assertEquals(1, sumCalculator.sum( 1));
    }
    @Test
    public void testThatSumCalculatorWorksCorrect2(){
        assertEquals(6, sumCalculator.sum( 3));
    }
    @Test
    public void testThatSumCalculatorWorksCorrect3(){
            
        assertThrows(IllegalArgumentException.class, sumCalculator.sum(0));
    }
    private void assertThrows(Class<IllegalArgumentException> illegalArgumentExceptionClass, int sum) {
    }
}
