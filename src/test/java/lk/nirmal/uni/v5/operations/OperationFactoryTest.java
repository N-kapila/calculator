package lk.nirmal.uni.v5.operations;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OperationFactoryTest {

    @Test
    public void should_return_AddOperator_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");
        assertThat(operation, instanceOf(AddOperator.class));
    }

    @Test
    public void should_return_SubOperator_object_when_operator_is_sub(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");
        assertThat(operation, instanceOf(SubOperator.class));
    }
}