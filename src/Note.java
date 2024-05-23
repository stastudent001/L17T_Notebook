import java.io.Serializable;
import java.time.LocalDateTime;

public class Note implements Serializable {
    private static final long serialVersionUID = 42L;
    private String header;
    private LocalDateTime date;
    private String email;
    private String message;

    public Note(String header, LocalDateTime date, String email, String message) {
        this.header = header;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public String getHeader() {
        return header;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "header='" + header + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                "}\n";
    }
}
