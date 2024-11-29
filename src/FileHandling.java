import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        String fileName;
        if(args.length>0){
            fileName=args[0];
        }else{
            System.out.println("Enter file name : ");
            Scanner in = new Scanner(System.in);
            fileName=in.nextLine();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Hello1.txt"))){
            writer.write("Hello World !");
            System.out.println("Message write in file : " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("Hello1.txt"))){
            StringBuilder content = new StringBuilder();
            String line;
            if((line= reader.readLine())!=null){
                content.append(line).append("\n");
                System.out.println("Message read from file: \n" + content.toString().trim());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
