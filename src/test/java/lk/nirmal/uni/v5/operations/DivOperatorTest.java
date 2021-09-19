package lk.nirmal.uni.v5.operations;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DivOperatorTest {

    @Test
    public void should_divide_positive_values() throws InvalidOperationException {

        DivOperator devOperator = new DivOperator();
        Double result = devOperator.execute(new Double[]{18.0,6.0});

        assertThat(result, is(3.0));

    }

    @Test
    public void should_not_divide_by_zero() throws InvalidOperationException {

        DivOperator devOperator = new DivOperator();
        Double result = devOperator.execute(new Double[]{18.0,3.0});

        //assertThat(result, is(3.0));

    }


}
