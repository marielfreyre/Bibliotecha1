
/**
 * Created by mfreyre on 8/4/15.
 */
public class Book {
    private final String name;
    private final Integer yearPublished;
    private final String author;

    public Book(String name, Integer yearPublished, String author) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public String getAuthor() {
        return author;
    }
}
