import java.io.*;
import java.util.Scanner;
public class BlankTrimmer {
    public static void main(String[] args) {

        File fileName;
        Scanner in = null;
        PrintWriter writer = null;
        String outputvalue = "";
        try {
            fileName = new File("HiSima.txt");
            in = new Scanner(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (in.hasNextLine()){
            String value = in.next();
            outputvalue+=value;
        }
        try{
            fileName = new File("HiSima.txt");
            writer = new PrintWriter(fileName);
            writer.println(outputvalue);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        in.close();
        writer.close();
    }
}