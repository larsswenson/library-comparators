import java.util.*;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Metamorphosis", "Franz Kafka", 1915));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
        books.add(new Book("Animal Farm", "George Orwell", 1945));
        books.add(new Book("The Stranger", "Albert Camus", 1942));

        // Title
        Collections.sort(books);
        System.out.println("Sorted by Title:");
        books.forEach(System.out::println);

        // Author
        Collections.sort(books, new AuthorComparator());
        System.out.println("Sorted by Author:");
        books.forEach(System.out::println);

        // Year
        Collections.sort(books, new YearComparator());
        System.out.println("Sorted by Year:");
        books.forEach(System.out::println);

        // Author then title
        Collections.sort(books, new ChainedComparator());
        System.out.println("Author, then Title:");
        books.forEach(System.out::println);
    }
}

