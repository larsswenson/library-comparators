import java.util.Comparator;

class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}

class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b2.getYear(), b1.getYear()); // For descending years
    }
}

class ChainedComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.getAuthor().compareTo(b2.getAuthor());
        if (authorCompare != 0) {
            return authorCompare;
        }
        return b1.getTitle().compareTo(b2.getTitle()); // Sort by title if same author 
    }
}

