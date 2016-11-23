import java.util.ArrayList;
public class Items {
    ArrayList<OneItem> todoList = new ArrayList<OneItem>();
    public Items() {
        todoList.add(new OneItem("Walk the dog"));
        todoList.add(new OneItem("Buy milk"));
        todoList.add(new OneItem("Do homework"));
    }
    public void list() {

        for (int i = 0; i < todoList.size(); i++){
            System.out.println(todoList.get(i));
        }
    }
    public void add(String newTodo) {
        todoList.add(new OneItem(newTodo));
    }
    public void remove(int uri) {
        todoList.remove(uri);
    }
    public void completeInd(int i){
        todoList.get(i).complete();
    }
}



