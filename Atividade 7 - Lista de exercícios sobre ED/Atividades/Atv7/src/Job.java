public class Job {

    private String documentName;
    private int jobId;

    public Job(String documentName, int jobId) {
        this.documentName = documentName;
        this.jobId = jobId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getJobId() {
        return jobId;
    }

    @Override
    public String toString() {
        return "Job{" +
                "documentName='" + documentName + '\'' +
                ", jobId=" + jobId +
                '}';
    }
}