package interfaces;

public interface Administrator extends User, BookHolder {
    void findBook(String title);

    void giveBook(Reader reader);

    void overdueNotification(Reader reader);
}
