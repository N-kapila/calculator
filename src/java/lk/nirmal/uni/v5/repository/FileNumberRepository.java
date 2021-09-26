package lk.nirmal.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws NumberRepositoryException {
        List<String> numbers = null;
        try {
            numbers = Files.readAllLines(Paths.get("numbers.text"));
        } catch (IOException e) {
            throw new NumberRepositoryException(e, "Couldn't read the txt file.");

        }
        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));
        return new Double[]{num1, num2};
    }
}


