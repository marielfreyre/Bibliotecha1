import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by mfreyre on 8/4/15.
 */
public class BookTest {
    @Test
    public void shouldReturnAName() {
        Book book = new Book("Mariel's Groos Juice", 2015, "Pat Dale");
        assertThat(book.getName(), is("Mariel's Groos Juice"));
    }

    @Test
    public void shouldReturnYearPublished() {
        Book book = new Book("Mariel's Groos Juice", 2015, "Pat Dale");
        assertThat(book.getYearPublished(), is(2015));
    }

    
}
