import java.io.*;

public class Find1 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Useage : java Find <word> <file1> <file2>...");
            return;
        }
        String word = args[0];
        for(int i=1;i<args.length;i++){
            String fileName = args[i];
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            int lineCount=1;
            while ((line= reader.readLine())!=null){
                if(line.contains(word)){
                    System.out.println(fileName + ":" + line);
                }
                lineCount++;
            }

            }catch (FileNotFoundException e){
            System.out.println("File not found " + fileName);
        }catch (IOException e){
            System.out.println("Error found " + fileName);
        }
        }
    }
}
