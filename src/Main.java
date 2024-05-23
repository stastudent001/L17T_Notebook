import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("notes.kirikpidr"));
            Notebook notebook = (Notebook) ois.readObject();
            System.out.println(notebook.toString());
            ois.close();

            //notebook.addNote(new Note("Tasd", LocalDateTime.of(2024,05, 23, 10, 22),
                    "wet@jut.me", "to go"));
            notebook.findByDate(LocalDate.now());

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notes.kirikpidr"));
            oos.writeObject(notebook);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}