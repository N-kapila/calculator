package lk.nirmal.uni.v4;

import lk.nirmal.uni.v4.operations.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs(args);
        String opr = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(opr);
        final double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("Result is " + result);
    }
}
