import java.io.Serializable;
import java.util.ArrayList;

public class Notebook implements Serializable {
    private static final long serialVersionUID = 42L;
    private ArrayList<Note> notes;

    public Notebook(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
