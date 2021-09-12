package lk.nirmal.uni.v5;

import lk.nirmal.uni.v5.input.*;
import lk.nirmal.uni.v5.operations.OperationFactory;
import lk.nirmal.uni.v5.repository.*;
import lk.nirmal.uni.v5.ui.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp calculatorApp = new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        calculatorApp.execute();
    }
}