package lk.nirmal.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

   public Double[] getNumbers() throws IOException {
       List<String> numbers = Files.readAllLines(Paths.get("numbers.text"));
       double num1 = Double.parseDouble(numbers.get(0));
       double num2 = Double.parseDouble(numbers.get(1));
       return  new Double[]{num1,num2};
    }
}
