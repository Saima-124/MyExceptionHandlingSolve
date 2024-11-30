import java.util.Scanner;
import java.util.NoSuchElementException;

public class DataSetReader {
    public double readData(Scanner scanner) throws NoSuchElementException {
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (or a non-numeric value to stop): ");
            try {
                double value = scanner.nextDouble(); // Read the next double
                sum += value;
                count++;
            } catch (NoSuchElementException e) {
                // Exit loop when non-numeric input is encountered
                break;
            }
        }

        if (count == 0) {
            throw new NoSuchElementException("No valid numeric input was provided.");
        }

        return sum / count; // Return the average
    }
}
