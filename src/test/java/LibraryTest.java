import org.junit.Before;
import org.junit.Test;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'mfreyre' at '8/4/15 1:55 PM' with Gradle 2.5
 *
 * @author mfreyre, @date 8/4/15 1:55 PM
 */
public class LibraryTest {

    private List<String> libraryBooksForTest;
    private PrintStream printStream;
    private Library library;

    @Before
    public void setUp() throws Exception {
        libraryBooksForTest = new ArrayList<>();
        printStream = mock(PrintStream.class);

    }

    @Test public void shouldPrintWelcome() {
        library = new Library(printStream, libraryBooksForTest);
        library.printsWelcome();
        verify(printStream).println("Welcome to the Library.");
    }

    @Test
    public void shouldListAllLibraryBooksWhenBooksExist() {
        library = new Library(printStream, libraryBooksForTest);
        libraryBooksForTest.add("Pat's Journal");
        libraryBooksForTest.add("Mariel's Secrets");
        library.listAllLibraryBooks();

        verify(printStream).println("Pat's Journal");
        verify(printStream).println("Mariel's Secrets");
    }

    @Test
    public void shouldPrintNothingWhenNoLibraryBooksExist()  {
        library = new Library(printStream, libraryBooksForTest);
        library.listAllLibraryBooks();
        verifyZeroInteractions(printStream);

    }
}
