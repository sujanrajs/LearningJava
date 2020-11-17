package Lesson2Constructors;

public class BookWithoutConstructor {
    String title;
    String author;
    int pages;
    String language;

    public static void main(String[] args) {
        //These are so many lines of codes book1 and book2 check BookWithConstructor class
        BookWithoutConstructor book1 = new BookWithoutConstructor();
        book1.title = "Harry Potter";
        book1.author = "JK Rowling";
        book1.pages = 500;
        book1.language = "English";

        BookWithoutConstructor book2 = new BookWithoutConstructor();
        book2.title = "The 4 Hour Work Week";
        book2.author = "Time Ferriss";
        book2.pages = 300;
        book2.language = "English";

        System.out.println(book2.pages);
    }
}
