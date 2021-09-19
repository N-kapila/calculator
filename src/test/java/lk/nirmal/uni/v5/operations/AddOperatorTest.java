package lk.nirmal.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperatorTest {
    @Test
    public void should_add_positive_value() {
        AddOperator addOperator = new AddOperator();
        Double result = addOperator.execute(new Double[]{5.0,6.0});
        assertThat(result,is(11.0));
    }
    @Test
    public void should_add_zeros(){

        AddOperator addOperator = new AddOperator();
        Double result = addOperator.execute(new Double[]{0.0,0.0});

        assertThat(result, is(0.0));

    }

    @Test
    public void should_add_negative_values() {

        AddOperator addOperator = new AddOperator();
        Double result = addOperator.execute(new Double[]{-1.0, -3.0});

        assertThat(result, is(-4.0));
    }
    }
