import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("notes.kirikpidr"));
            Notebook notebook = (Notebook) ois.readObject();
            ois.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notes.kirikpidr"));
            oos.writeObject(notebook);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}