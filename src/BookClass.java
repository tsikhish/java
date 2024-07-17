public class BookClass{
    private String title;
    private String author;
    private int pablicationYear;
    private String isbn;
    public BookClass(String title, String author, int pablicationYear, String isbn) {
        this.title = title;
        this.author = author;
        this.pablicationYear = pablicationYear;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPablicationYear() {
        return pablicationYear;
    }
    public void setPablicationYear(int pablicationYear) {
        this.pablicationYear = pablicationYear;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String toString() {
        return "Title: "+title+"/n"+"Author: "+author+"Year"+pablicationYear+"Isbn"+isbn;
    }

}
