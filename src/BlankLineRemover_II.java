import java.io.*;
import java.util.Scanner;
public class BlankLineRemover_II {
    public static void main(String[] args) {
        File inputFile;
        Scanner in = null;
        PrintWriter writer = null;
        String outputValue = "";
        try{
            inputFile = new File("Hi.txt");
            in = new Scanner(inputFile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        while (in.hasNext()){
            String value = in.next();;
            outputValue+=value;
        }
        try{
            inputFile = new File("Hi.txt");
            writer = new PrintWriter(inputFile);
            writer.printf(outputValue);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        in.close();
        writer.close();

    }
}
