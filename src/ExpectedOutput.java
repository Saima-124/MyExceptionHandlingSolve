import java.io.*;
import java.util.Scanner;
public class ExpectedOutput {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        try{
            inputFile.createNewFile();
            outputFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(Scanner in = new Scanner(inputFile); PrintWriter writer = new PrintWriter(outputFile)){
    int count=1;
        while(in.hasNextLine()){
            String value = in.nextLine();
            writer.printf("/* %d */ %s%n",count,value);
            count++;
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
