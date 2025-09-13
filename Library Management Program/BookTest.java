package lib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    void test_is_available(){
        Book b=new TextBook("Maths","Author A","111","Mathematics");
        assertTrue(b.is_available());
    }

    @Test
    void test_issue_book(){
        Book b=new SelfHelpBook("Mindset","Author B","222","Growth");
        b.issue();
        assertFalse(b.is_available());
    }

    @Test
    void test_return_book(){
        Book b=new Novel("Swami and Friends","R.K. Narayan","333","Childhood");
        b.issue();
        b.return_book();
        assertTrue(b.is_available());
    }
}
