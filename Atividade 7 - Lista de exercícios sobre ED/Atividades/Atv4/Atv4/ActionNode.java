public class ActionNode {

    private String action;
    private ActionNode next;
    private ActionNode prev;

    public ActionNode(String action) {
        this.action = action;
        this.next = null;
        this.prev = null;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ActionNode getNext() {
        return next;
    }

    public void setNext(ActionNode next) {
        this.next = next;
    }

    public ActionNode getPrev() {
        return prev;
    }

    public void setPrev(ActionNode prev) {
        this.prev = prev;
    }
}