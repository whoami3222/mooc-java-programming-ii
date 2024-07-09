import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;
    public TodoList(){
        tasks = new ArrayList<>();
    }


    public void add(String task){
        this.tasks.add(task);

    }


    public void print(){
        int i = 1;
        for (String string : tasks) {
            System.out.println(i + ": " + string);
            i++;
        }
    }


    public void remove(int number){
        tasks.remove(number - 1);
    }


}
