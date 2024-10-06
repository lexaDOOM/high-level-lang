package edu.penzgtu;

public class Book {
    private Author author;
    private String bookTitle;

    // Setters
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Getters
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookInfo() {
        return String.format("Book title: %s\nAuthor name: %s\nBirth Year: %d\n", getBookTitle(),
                author.getName(), author.getBirthYear());
    }
}
