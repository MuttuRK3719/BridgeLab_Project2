package java8features.optionalclass.librarymanagement;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Male Mahadeshwara", "Kuvempu", 500);
        Book book2 = new Book(102, "Kannada Nudi", "D. R. Bendre", 180.50);
        Book book3 = new Book(103, "Vachana Sahitya", "Basavanna", 750);
        Book book4 = new Book(104, "Ramayana Darshanam", "Kuvempu", 320.00);
        Book book5 = new Book(105, "Mankuthimmana Kagga", "D. V. Gundappa", 850);
        Book book6 = new Book(106, "Bhagavad Gita – Kannada Translation", "Vinoba Bhave", 1500);
        Book book7 = new Book(107, "Samskara", "U. R. Ananthamurthy", 190.25);
        Book book8 = new Book(108, "Karvalo", "Poornachandra Tejaswi", 2000);
        List<Book> books = List.of(book1, book2, book3, book4, book5, book6, book7, book8);
        sortBooks(books).forEach(System.out::println);
        uniqueAuthors(books).forEach(System.out::println);
        System.out.println(mostExpensive(null).map(Book::toString).orElse("No book available"));
    }

    //Sort the books by price and price should greater than 500
    public static List<Book> sortBooks(List<Book> books) {
        return books.stream().filter(book -> book.getPrice() > 500).sorted((a, b) -> (int) (a.getPrice() - b.getPrice())).toList();
    }

    //List unique authors books
    public static List<Book> uniqueAuthors(List<Book> books) {
        return new ArrayList<>(books
                .stream()
                .collect(Collectors.toMap(Book::getAuthor, Function.identity(), (k, k1) -> k, LinkedHashMap::new))
                .values());
    }

    //return most expensive book
    public static Optional<Book> mostExpensive(List<Book> books) {
        return Optional.ofNullable(books).map(list -> list.stream().max(Comparator.comparingDouble(Book::getPrice))).orElse(Optional.empty());
    }
}
