import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DollarTest {


    @Test
    public void testMultiplication2(){

        //Given -> dado que
        Dollar five = new Dollar(5);

        // When  -> quando
        Dollar product = five.times(2);

        // Then ->
        int expectedResultMultiplication10 = 10;
        assertEquals(expectedResultMultiplication10 , product.amount);


        // When  -> quando
         product = five.times(3);

        // Then ->
        int expectedResultMultiplication15 = 15;
        assertEquals(expectedResultMultiplication15 , product.amount);

    }

    @Test
    public void testEquality () {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
