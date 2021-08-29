package v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //make sure to validate the arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument..");
            return;
        }

        String operation = args[0];
        if (!(operation.equals("add") || operation.equals("mul") || operation.equals("sub"))) {
            System.out.println("provide add,sub or mul as the operator argument!");
            return;
        }


        //read the numbers from text file
        List<String> numbersStrs = Files.readAllLines(Paths.get("C:\\Users\\tharu\\OneDrive\\Desktop\\software\\calculator\\src\\java\\numbers.txt"));

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));
        double result = 0;
        if (operation.equals("add")) {
            result = number1 + number2;
        } else if (operation.equals("sub")) {
            result = number1 - number2;
        } else if (operation.equals("mul")) {
            result = number1 * number2;
        }

        //or we can use switch case statement
        System.out.println("The result is " + result);
    }
}