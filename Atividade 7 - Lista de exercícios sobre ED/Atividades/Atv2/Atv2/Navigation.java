public class Navigation {

    private String url;
    private Navigation next;


    public Navigation(String url) {
        this.url = url;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Navigation getNext() {
        return next;
    }

    public void setNext(Navigation next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "url='" + url + '\'' +
                ", next=" + next +
                '}';
    }
}
