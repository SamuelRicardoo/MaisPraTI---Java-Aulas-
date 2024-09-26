import java.util.LinkedList;
import java.util.Queue;

public class QueueJob {

    private Queue<Job> job;

    public QueueJob() {
        this.job = new LinkedList<>();
    }

    public void addJob(Job jobAdd) {
        job.add(jobAdd);
        System.out.println("Trabalho de impressão adicionado: " + jobAdd);
    }

    public void processNextJob() {
        if (!job.isEmpty()) {
            Job nextJob = job.poll();
            System.out.println("Processando trabalho de impressão: " + nextJob);
        } else {
            System.out.println("Nenhum trabalho de impressão na fila.");
        }
    }

    public void showJobs() {
        if (job.isEmpty()) {
            System.out.println("A fila de trabalhos de impressão está vazia.");
        } else {
            System.out.println("Trabalhos de impressão na fila:");
            for (Job job : job) {
                System.out.println(job);
            }
        }
    }

    public int getJobCount(){
        return job.size();
    }

}