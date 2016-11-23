import java.io.*;

/**
 * Created by Zsuzska on 2016. 11. 18..
 */
public class App {
    static String filePath;
    static File todolist;
    public static void main(String[] args) {

        Inputs inputs = new Inputs();
        inputs.printUsage();
        inputs.command();

        todolist = new File("todolist.txt");
        try {
            todolist.createNewFile();
            filePath = todolist.getCanonicalPath();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        if (todolist.exists()){
            System.out.println("yay");
        }

        //reading
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("todolist.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line = br.readLine();
            while (line != null) {
                System.out.println("This line is read from file:" + line);
                line = br.readLine(); // reading the next line
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
