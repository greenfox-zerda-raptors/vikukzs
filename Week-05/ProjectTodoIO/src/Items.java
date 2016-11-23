import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Zsuzska on 2016. 11. 18..
 */
public class Items {
    ArrayList<OneItem> todoList = new ArrayList<OneItem>();

    public Items() {
        todoList.add(new OneItem("Walk the dog"));
        todoList.add(new OneItem("Buy milk"));
        todoList.add(new OneItem("Do homework"));
    }
    public void list() {

        for (int i = 0; i < todoList.size(); i++){
            String sTodo = todoList.get(i).getName();
            System.out.println(sTodo);
        }
    }
    public void add(String newTodo) {
        todoList.add(new OneItem(newTodo));
    }
    public void remove(int uri) {
        todoList.remove(uri);
    }

    public void write() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("todolist.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (OneItem i : todoList){
                bw.write(i.toString());
                bw.newLine();

            }
            // close up and flush
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}



