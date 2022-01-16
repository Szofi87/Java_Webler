package javase_exam_1.task3;


public class Book implements Comparable<Book> {
    private String title;

    private String isbn;

    private String publisher;

    private Author author;

    private int year;

    private Language language;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


    // Compare two books by their authors
    // If the two books are from the same author, compare them by their titles
    @Override
    public int compareTo(Book o) {
        if(this.author.compareTo(o.author) == 0) {
            return this.title.compareTo(o.title);
        } else {
            return this.author.compareTo(o.author);
        }
    }

    // Generate a one line string that contains all the information about this book
    @Override
    public String toString() {
        return this.title + " " + this.author + " " + this.publisher + " " + this.year + " " + this.language + " " + this.isbn;
    }
}
