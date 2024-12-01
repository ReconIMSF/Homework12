import java.util.Objects;

public class Book {
    // Создаём класс "Книга" с параметрами:
    private String title; // название книги
    private int yearPublishing; // год публикации
    private Author author; // автор

    public Book(String title, int yearPublishing, Author author) {
        // конструтор для автоматизированного создания книг
        // название и год публикации вводим в main, автора берём из объектов, которые ранее указаны в объектах-авторах
        this.title = title; // задание имени книги (обращение к свойству класса Book)
        this.yearPublishing = yearPublishing; // задание книги года издания книги (обращение к свойству класса Book)
        this.author = author; // забираем данные автора из ранее указанного объекта-автора
    }

    public String getTitle() {
        // Геттер для названия книги
        return this.title;
    }

    public int getYearPublishing() {
        // Геттер для года публикации
        return this.yearPublishing;
    }

    public Author getAuthor() {
        // Геттер для автора книги
        return this.author;
    }

    public void setTitle(String title) {
        // Сеттер для названия книги
        this.title = title;
    }

    public void setYearPublishing(int yearPublishing) {
        // Сеттер для года публикации
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        // Переводим все данные по книге в строку для упрощения вывода
        return "Book{" +
                "title='" + title + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // Сравнение книг
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        // Сравнение книг по хеш-коду
        return Objects.hash(title, yearPublishing, author);
    }
}