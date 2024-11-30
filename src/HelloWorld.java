import java.io.*;


public class HelloWorld {
    public static void main(String[] args) {
        //  String fileName = "hello.txt";
        //  String message = "Hello, World!";

        // Step 1: Write "Hello, World!" to the file
        try (FileWriter writer = new FileWriter("hello.txt")) {
            writer.write("Hello, World!");
            //System.out.println(message);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());

        }

        // Step 2: Read the message from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            String fileContent = reader.readLine();
            System.out.println( fileContent);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}