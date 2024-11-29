import java.io.*;
public class HelloWorld {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"))){
            writer.write("Hello,World");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))){
            String line;
            if((line = reader.readLine())!=null){
                content.append(line).append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(content.toString().trim());
        }

    }


