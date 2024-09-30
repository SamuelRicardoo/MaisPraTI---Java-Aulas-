public class Process {

    private String name;
    private int proccesId;

    public Process(String name, int proccesId) {
        this.name = name;
        this.proccesId = proccesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProccesId() {
        return proccesId;
    }

    public void setProccesId(int proccesId) {
        this.proccesId = proccesId;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name='" + name + '\'' +
                ", proccesId=" + proccesId +
                '}';
    }
}
