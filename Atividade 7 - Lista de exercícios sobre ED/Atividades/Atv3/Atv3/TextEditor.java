public class TextEditor {

    private Action actions;
    private StringBuilder text;

    public TextEditor() {
        this.actions = null;
        this.text = new StringBuilder();
    }

    // Adiciona uma ação de texto
    public void addText(String newText) {
        Action newAction = new Action("add", newText);

        text.append(newText);
        System.out.println("Texto atual: " + text.toString());

        if (actions == null) {
            actions = newAction;
        } else {
            Action temp = actions;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newAction);
        }
    }

    public void undo() {
        if (actions == null) {
            System.out.println("Nenhuma ação para desfazer.");
            return;
        }

        if (actions.getNext() == null) {
            if (actions.getActionType().equals("add")) {

                text.delete(text.length() - actions.getText().length(), text.length());
            }
            actions = null;
        } else {
            Action temp = actions;
            Action prev = null;

            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }

            if (temp.getActionType().equals("add")) {
                text.delete(text.length() - temp.getText().length(), text.length());
            }

            prev.setNext(null);
        }

        System.out.println("Texto após desfazer: " + text.toString());
    }

    public String getText() {
        return text.toString();
    }
}
