import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator ;

    @BeforeEach
    void setUp(){
        calculator = new Calculator() ;
    }
    @Test
    void testMultiply(){
        assertEquals(20 ,calculator.multiply(4 ,5)) ;
        assertEquals(25 ,calculator.multiply(4 ,5)) ;

    }






}
