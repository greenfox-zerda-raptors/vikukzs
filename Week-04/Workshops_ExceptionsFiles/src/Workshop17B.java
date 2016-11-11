import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by Zsuzska on 2016. 11. 11..
 */
public class Workshop17B {
    public static String basePath = "C:/Users/Zsuzska/Greenfox/vikukzs/Week-04/Workshops_ExceptionsFiles";
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("dear user, enter a fiile, assuming we are in " + basePath);
            File source = loadFile(scanner);
            if (source == null){
                return; // end of prog
            }
            System.out.println("dear user, enter a destination file name, assuminfg the same path: " + basePath);
            String filenameDestinaton = scanner.next();
            System.out.println("we are copying from" + source.getPath() + " to " + basePath + filenameDestinaton +", confirm with Y or N to abort");
            File destination = new File(basePath + filenameDestinaton);
            if (destination.exists()){
                destination.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(source));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
            String line = reader.readLine();
            int length = line.length();
            while (line != null){
                writer.write(line);
                writer.newLine();;
                line = reader.readLine();
                if (line != null) {
                    writer.newLine();
                    length += line.length() + 1;
                }
            }
            reader.close();
            writer.close();
            System.out.println("we are done.");

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static File loadFile(Scanner scanner){
        String fileSrc = scanner.next();
        if (fileSrc.equals("")){
            return null;
        }
        File source = new File(basePath + fileSrc);
        if (source.exists()) {
            return source;
        }
        else {
            System.out.println("sorry, this file doesn't exist, try again or blank to exit");
            return loadFile(scanner);
        }

    }
}
