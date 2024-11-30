//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Author lukyanenkoS =  new Author("Cергей", "Лукьяненко");

        Author musanifS = new Author("Сергей", "Мусаниф");
        Book coldStars = new Book("Звёзды - Холодные игрушки", 1998, lukyanenkoS);
        Book empireDance = new Book("Имперские танцы", 2007, musanifS);
        System.out.println("empireDance = " + empireDance.getTitle() + " " + empireDance.getYearPublishing());
        empireDance.setYearPublishing(2006);
        System.out.println("empireDance = " + empireDance.getAuthor() + " " +empireDance.getTitle() + " " + empireDance.getYearPublishing());
    }
}