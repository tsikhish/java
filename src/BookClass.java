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
//Library Management System
//1. შექმენით Book კლასი:
//        ○ ველები: title (String), author (String), ISBN (String), and publicationYear
//(int).
//        ○ მეთოდები:
//        ■ Კონსტრუქტორი რომელიც ინიციალიზაციას გაუკეთებს ველებს.
//■ toString() მეთოდი რომელიც გამოიტანს წიგნის დეტალებს.
//
//        2. შექმენით Library კლასი:
//        ○ ველები: A collection (მაგალითად, ArrayList) Book-ის ობიექტების შესანახად.
//○ მეთოდები:
//        ■ მეთოდი რომელიც დაამატებს Book-ის ობიექტს კოლექციაში.
//■ მეთოდი რომელიც ამოიღებს Book-ის ობიექტს ISBN-ით იტერატორის
//გამოყენებით BookIterator.
//        ■ მეთოდი რომელიც გამოიტანს ყველა წიგნს იტერატორის გამოყენებით
//BookIterator.
//■ Მეთოდი რომელიც დაასორტირებს წიგნებს publicationYear-ით და
//გამოიყენებს ანონიმურ კლასს comparator-ისას.
//
//3. Inner Class - BookIterator:
//        ○ შექმენით BookIterator inner კლასი რომელიც დააიმპლემენტირებს Iterator
//ინტერფეისს , გადაყვება წიგნებს ბიბლიოთეკაში.