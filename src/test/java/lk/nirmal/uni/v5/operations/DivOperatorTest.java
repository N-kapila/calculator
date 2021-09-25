package lk.nirmal.uni.v5.operations;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperatorTest {

    @Test
    public void should_divide_positive_values() throws InvalidOperationException {

        DivOperator divOperator = new DivOperator();
        Double result = divOperator.execute(new Double[]{18.0,6.0});

        assertThat(result, is(3.0));

    }

    @Test
    public void should_not_divide_by_zero() throws InvalidOperationException {

        DivOperator divOperator = new DivOperator();
        assertThrows(InvalidOperationException.class,()->{
            divOperator.execute(new Double[] {6.8,0.0});
        });


    }

}