public class Book {
    String title;
    String author;
    int year;
    int pages;
    String genre;

    public Book(String title, String author, int year, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
    }

    boolean isModern() {
        return year > 2010;
    }

    boolean isGenre(String checkGenre) {
        return genre.equals(checkGenre);
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Pages: " + pages + ", Genre: " + genre + "\nModern: " + isModern();
    }
}