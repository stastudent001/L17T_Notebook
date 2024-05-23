import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook implements Serializable {
    private static final long serialVersionUID = 42L;
    private ArrayList<Note> notes;

    public Notebook(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void removeNote(int index){
        notes.remove(3);
    }

    public void addNote(Note note) {
        Pattern VALID_EMAIL_ADRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADRESS_REGEX.matcher(note.getEmail());
        if (matcher.matches()) {
            notes.add(note);
        } else {
            System.out.println("Email is not valid");
        }
    }

    public void findByHeader(String s) {
        Pattern pattern = Pattern.compile(".*" + s + ".*", Pattern.CASE_INSENSITIVE);
        notes.stream().filter(x -> x.getHeader().matches(pattern.pattern())).forEach(System.out::println);
    }

    public void findByEmail(String s) {
        Pattern pattern = Pattern.compile(".*" + s + ".*", Pattern.CASE_INSENSITIVE);
        notes.stream().filter(x -> x.getEmail().matches(pattern.pattern())).forEach(System.out::println);
    }

    public void findByMessage(String s) {
        Pattern pattern = Pattern.compile(".*" + s + ".*", Pattern.CASE_INSENSITIVE);
        notes.stream().filter(x -> x.getMessage().matches(pattern.pattern())).forEach(System.out::println);
    }

    public void findByDate(LocalDate localDate) {
        notes.stream().filter(x -> x.getDate().toLocalDate().toString()
                .matches(localDate.toString())).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notes=" + notes +
                "}";
    }
}
