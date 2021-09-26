package lk.nirmal.uni.v5.input;

public class CommandLineInputs implements Inputs {
    private final String args[];

    public CommandLineInputs(String args[]) {
        this.args = args;
    }

    public String getOperator() throws InvalidInputException {
        if (args.length == 0) {
            throw new InvalidInputException("Please provide any arguments");
        }

        String operation = args[0];

        if (!(operation.equals("add") || operation.equals("sub") || operation.equals("mul") || operation.equals("div"))) {
            throw new InvalidInputException("Please provide any valid operation");
        }
        return operation;
    }
}