package Lesson2Constructors;

public class BookWithConstructors {
    String title;
    String author;
    int pages;
    String language;

    public BookWithConstructors(String title, String author, int pages, String language){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.language = language;
    }

    // This is Constructor with parameters
    public static void main(String[] args) {
        BookWithConstructors book1 = new BookWithConstructors("Harry Potter", "JK Rowling", 500, "English");
        BookWithConstructors book2 = new BookWithConstructors("The 4 Hour Work Week", "Tim Ferriss", 300, "English");

        System.out.println(book1.author);
    }
}
