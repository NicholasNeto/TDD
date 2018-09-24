import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;





public class DollarTest {

    @Test
    public void testMultiplication(){


        //Given -> dado que
        Dollar five = new Dollar(5);


        // When  -> quando

         five.times(2);


        // Then ->

        int expectedResultMultiplication = 10;
        assertEquals(expectedResultMultiplication , five.amount);
    }


}
