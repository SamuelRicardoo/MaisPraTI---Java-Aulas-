public class Letter {

    private String naipe;
    private String value;

    public Letter(String naipe, String value) {
        this.naipe = naipe;
        this.value = value;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "naipe='" + naipe + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
