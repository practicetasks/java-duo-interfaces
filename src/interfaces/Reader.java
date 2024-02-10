package interfaces;

import model.Book;

public interface Reader extends User, BookHolder {
    void takeBook(Book book, Administrator administrator);

    void returnBook(Administrator administrator);
}
