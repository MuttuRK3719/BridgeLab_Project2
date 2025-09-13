import java8features.optionalclass.librarymanagement.Book;
import java8features.optionalclass.librarymanagement.LibraryManagement;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryManagementTest {
    Book book1 = new Book(101, "Male Mahadeshwara", "Kuvempu", 500);
    Book book2 = new Book(102, "Kannada Nudi", "D. R. Bendre", 180.50);
    Book book3 = new Book(103, "Vachana Sahitya", "Basavanna", 750);
    Book book4 = new Book(104, "Ramayana Darshanam", "Kuvempu", 320.00);
    Book book5 = new Book(105, "Mankuthimmana Kagga", "D. V. Gundappa", 850);
    Book book6 = new Book(106, "Bhagavad Gita – Kannada Translation", "Vinoba Bhave", 1500);
    Book book7 = new Book(107, "Samskara", "U. R. Ananthamurthy", 190.25);
    Book book8 = new Book(108, "Karvalo", "Poornachandra Tejaswi", 2000);
    List<Book> books = List.of(book1, book2, book3, book4, book5, book6, book7, book8);
    LibraryManagement libraryManagement = new LibraryManagement();

    @Test
    void filterAndSort() {
        List<Book> sortedList = List.of(book3, book5, book6, book8);
        List<Book> actualList = libraryManagement.sortBooks(books);
        assertEquals(sortedList, actualList);
    }

    @Test
    void uniqueAuthors() {
        List<Book> expectedResult = List.of(book1, book2, book3, book5, book6, book7, book8);
        List<Book> actualList = libraryManagement.uniqueAuthors(books);
        assertEquals(expectedResult, actualList);
    }

    @Test
    void mostExpensiveBook() {
        Optional<Book> expectedBook = Optional.ofNullable(book8);
        Optional<Book> actualBook = libraryManagement.mostExpensive(books);
        assertEquals(expectedBook, actualBook);
    }

    @Test
    void emptyBookList() {
        Optional<Object> empty = Optional.empty();
        Optional actual = libraryManagement.mostExpensive(List.of());
        assertEquals(empty, actual);
    }
}