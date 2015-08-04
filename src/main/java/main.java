import java.util.ArrayList;
import java.util.List;

/**
 * Created by mfreyre on 8/4/15.
 */
public class Main {
    public static void main(String[] args){

        List<String> listOfBooks = new ArrayList<>();
        Library library = new Library(System.out, listOfBooks);
        library.printsWelcome();
        library.listAllLibraryBooks();

    }

}
