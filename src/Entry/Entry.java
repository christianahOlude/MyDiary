package Entry;

import java.time.LocalDateTime;

public class Entry {
    public static int id;
    private String title;
    private String body;
    //private localDateTime dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
