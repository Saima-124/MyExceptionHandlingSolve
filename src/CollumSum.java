import java.io.*;
import java.util.Scanner;
public class CollumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input and output path : ");
        String input = in.next();
        String output = in.next();
        double total1=0,total2=0;
        int i=0;
        File inputFile = new File(input);
        try(Scanner con = new Scanner(inputFile); PrintWriter writer = new PrintWriter(output)){
            while (con.hasNextDouble()){
                total1+= con.nextDouble();
                total2+= con.nextDouble();
                i++;
            }
            writer.printf("%f %f",total1/i,total2/i);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
