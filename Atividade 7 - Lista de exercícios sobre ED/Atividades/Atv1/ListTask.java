import java.util.ArrayList;
import java.util.List;

public class ListTask {

    private List<Task> task;

    public ListTask(List<Task> task) {
        this.task = new ArrayList<>();
    }

    public void addTask(Task task) {
        if(task != null) {
            this.task.add(task);
            System.out.println("Adicionado");
        }else {
            System.out.print("Não foi possivel adicionar uma task\n");
        }
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }


    public void isDone(int id){
        Task task = this.task.get(id);

        if(task != null && !task.isDone()) {
            task.setDone(true);
            System.out.println("Task com sucesso");
        }else {
            System.out.println("Task não achada");
        }
    }

    public void removeTask(int id) {

        Task task = this.task.get(id);

        if(task != null) {
            this.task.remove(task);
            System.out.println("Removido com sucesso");
        }else {
            System.out.println("Task não Encontrada");
        }
    }
}