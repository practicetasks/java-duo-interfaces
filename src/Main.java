import interfaces.Administrator;
import interfaces.Reader;
import model.AdministratorImpl;
import model.ReaderImpl;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ReaderImpl("Вася");
        Administrator administrator = new AdministratorImpl("Инна");

        administrator.findBook("Властелин колец");
        administrator.giveBook(reader);

        System.out.println(reader.getName());
    }
}
