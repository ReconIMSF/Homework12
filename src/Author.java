import java.util.Objects;

public class Author { // Создаём класс "Автор" с данными:
    private String firstName; // имя автора
    private String lastName; // фамилия автора

    public Author(String firstName, String lastName) {
        // Конструктор для автоматизированного задания авторов книг
        this.firstName = firstName; // задание имени автора
        this.lastName = lastName; // задание фамилии автора
    }

    public String getFirstName() {
        // Геттер для имени автора
        return this.firstName;
    }

    public String getLastName() {
        // Геттер для фамилии автора
        return this.lastName;
    }

    @Override
    public String toString() {
        // Переводим имя и фамилию автора в один объект-строку
        return "Имя автора " + firstName +
                ", фамилия автора " + lastName + ".";
    }

    @Override
    public boolean equals(Object o) {
        // Сравнение авторов друг с другом, чтобы они не были одинаковыми
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        // Сравнение авторов через хэш-код
        return Objects.hash(firstName, lastName);
    }

    public void setFirstName(String firstName) {
        // Сеттер для имени автора
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // Сеттер для фамилии автора
        this.lastName = lastName;
    }
}