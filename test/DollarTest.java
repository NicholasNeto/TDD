import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.oops.DefaultOopVisitor;

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
        assertEquals(new Dollar(10), product);


        // When  -> quando
         product = five.times(3);

        // Then ->
        assertEquals(new Dollar(15) , product);

    }

    @Test
    public void testEquality () {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
