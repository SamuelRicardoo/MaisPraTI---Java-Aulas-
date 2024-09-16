public class Action {
    private String actionType;
    private String text;
    private Action next;

    public Action(String actionType, String text) {
        this.actionType = actionType;
        this.text = text;
        this.next = null;
    }

    public String getActionType() {
        return actionType;
    }

    public String getText() {
        return text;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}
