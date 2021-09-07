package lk.nirmal.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide any arguments");
           return;
        }

        String opr = args[0];

        if (!(opr.equals("add") || opr.equals("sub") || opr.equals("mul"))) {
            System.out.println("Please provide any valid operation");
            return;
        }

        List<String> numbers = Files.readAllLines(Paths.get("numbers.text"));

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));
        double result;

        switch (opr) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            default:
                result = num1 * num2;
                break;
        }

        System.out.println(result);
    }
}
