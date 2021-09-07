package lk.nirmal.uni.v4.operations;

public class DivOperator implements Operation{
    public double execute(Double[] numbers) {
        return numbers[0] / numbers[1];
    }
}
