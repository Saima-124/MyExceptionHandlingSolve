import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSetReader reader = new DataSetReader();

        try {
            double average = reader.readData(scanner);
            System.out.println("Average: " + average);
        } catch (NoSuchElementException e) {
            System.out.println("Non-numeric input encountered. Stopping...");
        } finally {
            scanner.close();
        }
    }
}
