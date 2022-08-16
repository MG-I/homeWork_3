package bookStudent.util;

import bookStudent.data.Book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class UtilBook {

    public static List<Book> generationBook() {
        List<Book> bookList = new LinkedList<>();

        for (int i = 0; i < 25; i++) {

            bookList.add(new Book("book" + i, 1978 + i, "author" + i, "type" + i, i + "authorName", i + "authorSurname", i + "authorPatronymic"));
        }
        return bookList;
    }

    public static HashSet<Book> generationBookTwo() {
        HashSet<Book> bookListH = new HashSet<>();

        for (int i = 0; i < 24; i++) {

            bookListH.add(new Book("book" + i, 1978 + i, "author" + i, "type" + i, i + "authorName", i + "authorSurname", i + "authorPatronymic"));
        }

        for (int i = 0; i < 6; i++) {
            bookListH.add(new Book("ook1", 1979, "author1", "type1", i + "authorName", i + "authorSurname", i + "authorPatronymic"));
        }
        return bookListH;
    }
}
