import org.fasttrackit.Converter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void testFtoC(){
        int valueF = 32;
        double resultC = Converter.convertToC(valueF);
        assertEquals(0, resultC, 0);
    }

    @Test
    public void testCtoF(){
        int valueC = 0;
        double resultF = Converter.convertToF(valueC);
        assertEquals(32, resultF, 0);
    }
    @Test
    public void zeroTest(){
        // F to C
        double resultC1 = Converter.convertToC(0);
        assertEquals(-17.77777777777778, resultC1, 0);

        // C to F
        double resultF2 = Converter.convertToF(0);
        assertEquals(32, resultF2, 0);
    }

    @Test
    public void bigNumberTest(){
        // F to C
        double resultC1 = Converter.convertToC(180032);
        assertEquals(100000, resultC1, 0);

        // C to F
        double resultF2 = Converter.convertToF(100000);
        assertEquals(180032, resultF2, 0);
    }
}
