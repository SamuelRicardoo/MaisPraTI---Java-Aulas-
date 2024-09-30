import java.util.LinkedList;
import java.util.Queue;

public class QueueProcess {

    Queue<Process> process;

    public QueueProcess() {
        process = new LinkedList<>();
    }

    public void addProcess(Process processAdd) {
        process.add(processAdd);
        System.out.println("Processo adicionado à fila: " + process);
    }

    public void executeNextProcess() {
        if (!process.isEmpty()) {
            Process nextProcess = process.poll();
            System.out.println("Executando processo: " + nextProcess);
        } else {
            System.out.println("Nenhum processo na fila para execução.");
        }
    }

    public void showProcesses() {
        if (process.isEmpty()) {
            System.out.println("A fila de processos está vazia.");
        } else {
            System.out.println("Processos na fila:");
            for (Process process : process) {
                System.out.println(process);
            }
        }
    }

    public int getProcessCount() {
        return process.size();
    }
}
