package ua.goit.chat;

/**
 * Created by admin on 18.08.16.
 */
public class Sms {
    private int id;
    private String text;


    public Sms() {
    }

    public Sms(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
