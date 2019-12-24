package AppBoard;

public class Message {
    private String description;
    private String author;

    public Message(String description, String author) {
        this.description = description;
        this.author = author;
    }

    public String getDescription() {
        description=this.author;
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Message{" +
                "description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
