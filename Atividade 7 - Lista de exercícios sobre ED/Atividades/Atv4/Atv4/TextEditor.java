public class TextEditor {

    private ActionNode currentAction;
    private ActionNode head;
    private ActionNode tail;

    public TextEditor() {
        this.currentAction = null;
        this.head = null;
        this.tail = null;
    }

    public void addAction(String action) {
        ActionNode newAction = new ActionNode(action);

        if (head == null) {
            head = newAction;
            tail = newAction;
            currentAction = newAction;
        } else {
            newAction.setPrev(tail);
            tail.setNext(newAction);
            tail = newAction;
            currentAction = newAction;
        }
        System.out.println("Ação '" + action + "' adicionada.");
    }

    public void undo() {
        if (currentAction == null) {
            System.out.println("Nenhuma ação para desfazer.");
            return;
        }

        System.out.println("Desfazendo ação '" + currentAction.getAction() + "'.");
        currentAction = currentAction.getPrev();
    }

    public void redo() {
        if (currentAction == null || currentAction.getNext() == null) {
            System.out.println("Nenhuma ação para refazer.");
            return;
        }

        currentAction = currentAction.getNext();
        System.out.println("Refazendo ação '" + currentAction.getAction() + "'.");
    }

    public void showHistory() {
        ActionNode temp = head;
        System.out.println("Histórico de Ações:");
        while (temp != null) {
            System.out.println(temp.getAction());
            temp = temp.getNext();
        }
    }

    public void showCurrentAction() {
        if (currentAction != null) {
            System.out.println("Ação atual: " + currentAction.getAction());
        } else {
            System.out.println("Nenhuma ação atual.");
        }
    }
}
