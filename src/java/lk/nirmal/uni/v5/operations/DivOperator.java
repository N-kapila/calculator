package lk.nirmal.uni.v5.operations;

import javax.management.InvalidAttributeValueException;

public class DivOperator implements Operation {

    public double execute(Double[] numbers) throws InvalidOperationException {
        if (numbers[1] == 0){
            throw new InvalidOperationException("Do not divide by zero");
        }
        return numbers[0] / numbers[1];

    }
}
