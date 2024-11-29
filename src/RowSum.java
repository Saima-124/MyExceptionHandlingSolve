import java.io.*;
import java.util.Scanner;
public class RowSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input file : ");
        String input = in.next();
        File inputFile = new File(input);
        try (Scanner con = new Scanner(inputFile)) {
            int rowNum = 1;
            while (con.hasNextLine()) {
                String line = con.nextLine().trim();
                if (line.isEmpty()) {
                    System.out.printf("Row %d average is  0.00000%n", rowNum);
                } else {
                    String[] numbers = line.split("\\s+");
                    double total = 0;
                    int count = 0;
                    for (String num : numbers) {
                        try {
                            double number = Double.parseDouble(num);
                            total += number;
                            count++;

                        } catch (NumberFormatException e) {
                            System.out.printf("Invalid row number %d : '%s'%n", rowNum, num);
                        }
                    }
                        double average = (count > 0) ? total / count : 0;
                        System.out.printf("Rownumber  %d and average number %.6f", rowNum, average);


                }
                rowNum++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}