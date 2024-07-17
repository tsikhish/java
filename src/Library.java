import java.util.*;

public class Library {
    private ArrayList<BookClass> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(BookClass book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        Iterator<BookClass> iterator = new BookIterator();
        while (iterator.hasNext()) {
            BookClass book = iterator.next();
            if (book.getIsbn().equals(ISBN)) {
                iterator.remove();
                break;  // Stop after removing the book
            }
        }
    }
    public  void getAllBooks(){
        Iterator<BookClass> iterator = new BookIterator();
        while (iterator.hasNext()) {
            BookClass book = iterator.next();
            System.out.println(book);
        }
    }
    public void sortPublicationYear() {
        Collections.sort(books,new Comparator<BookClass>() {
            public int compare(BookClass o1, BookClass o2) {
                return Integer.compare(o1.getPablicationYear(),o2.getPablicationYear());
            }
        });
    }
    private class BookIterator implements Iterator<BookClass> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public BookClass next() {
            if (!hasNext()) {
                throw new IllegalStateException("no such elements");
            }
            return books.get(index++);
        }
        @Override
        public void remove() {
            if (index <= 0) {
                throw new IllegalStateException("You can't remove an item until you've done at least one next()");
            }
            books.remove(--index);
        }

    }
}