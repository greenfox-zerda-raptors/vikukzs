import java.util.Scanner;
public class Inputs {
    static Scanner input = new Scanner(System.in);
    public void command() {
        String com = input.nextLine();
        Items listTodo = new Items();
        while (!com.contentEquals("q") || !com.contentEquals("quit")) {
            if (com.contentEquals("list") || com.contentEquals("l")) {
                listTodo.list();
            }
            if (com.contentEquals("add") || com.contentEquals("a")) {
                System.out.println("Add your todo!");
                String userAdd = input.nextLine();
                listTodo.add(userAdd);
                listTodo.list();
            }
            if (com.contentEquals("remove") || com.contentEquals("r")) {
                System.out.println("Which item would you like to remove from your todo list? Please, give a number.");
                listTodo.list();
                String userRemove = input.nextLine();
                int uri = Integer.parseInt(userRemove);
                listTodo.remove(uri - 1);
                listTodo.list();
            }
            if (com.contentEquals("complete") || com.contentEquals("c")) {
                System.out.println("Which item would you like to set complete? Please, give a number.");
                listTodo.list();
                String userComplete = input.nextLine();
                int urc = Integer.parseInt(userComplete);
                listTodo.completeInd(urc - 1);
                listTodo.list();
            }
            if (com.contentEquals("help") || com.contentEquals("h")) {
                printUsage();
            }
            if (com.contentEquals("quit") || com.contentEquals("q")) {
                break;
            }
            com = input.nextLine();
        }
    }
    public void printUsage(){
        String helpCommands = "CLI Todo application\n" +
                "====================\n" +
                "\n" +
                "Available commands:\n" +
                " list       Lists all the tasks\n" +
                " l          shorthand for list\n" +
                " add        Adds a new task\n" +
                " a          shorthand for add\n" +
                " remove     Removes a task\n" +
                " r          shorthand for remove\n" +
                " complete   Completes a task\n" +
                " c          shorthand for complete\n" +
                " help       Print out this list again\n" +
                " h          shorthand for help\n" +
                " quit       Quit program\n" +
                " q          shorthand for quit";
        System.out.println(helpCommands);
    }
}
