import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;





public class DollarTest {




    @Test
    public void testMultiplication2(){

        //Given -> dado que
        Dollar five = new Dollar(5);



        // When  -> quando
        five.times(2);

        // Then ->
        int expectedResultMultiplication10 = 10;
        assertEquals(expectedResultMultiplication10 , five.amount);




        // When  -> quando
        five.times(3);

        // Then ->
        int expectedResultMultiplication15 = 15;
        assertEquals(expectedResultMultiplication15 , five.amount);

    }

}
