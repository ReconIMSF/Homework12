public class Book {
    private String title;
    private int yearPublishing;
    private Author author;

    public Book(String title, int yearPublishing, Author author) {
        // конструтор для автоматизированного создания книг
        this.title = title; // задание имени книги (обращение к свойству класса Book)
        this.yearPublishing = yearPublishing; // задание книги года издания книги (обращение к свойству класса Book)
        author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}