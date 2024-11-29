import java.io.*;
import java.util.Scanner;
public class CWLCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter File name : ");
        String inputFile = in.next();
        int character=0,word=0,lines=0;
        File input = new File(inputFile);
        try(Scanner con = new Scanner(input)){

            while (con.hasNextLine()){
                String line = con.nextLine();
                character+=line.length();
                String[] words = line.trim().split("\\s+");
                if(words.length>0 && !words[0].isEmpty()){
                    word+=words.length;
                }
                lines++;
            }
            System.out.println("Character are = " + character);
            System.out.println("Words are = " + word);
            System.out.println("Lines are = " + lines);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
