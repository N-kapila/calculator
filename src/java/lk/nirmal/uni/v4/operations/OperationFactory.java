package lk.nirmal.uni.v4.operations;

public class OperationFactory {

    public Operation getInstance(String operator) {
        Operation operation = null;

        switch (operator) {
            case "add":
                operation = new AddOperator();
                break;

            case "sub":
                operation = new SubOperator();
                break;

            case "div":
                operation = new DivOperator();
                break;

            default:
                operation = new MulOperator();
                break;
        }
        return operation;
    }
}
