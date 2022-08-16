package bookStudent.util;

import bookStudent.data.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UtilSortBook {

    public static void sortName(String name) {

        List books = UtilBook.generationBook();

        if (name == "name") {

            Collections.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getAuthorName().compareTo(o2.getAuthorName());
                }
            });
            System.out.println(books);
        } else if (name == "surname") {
            Collections.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getAuthorSurname().compareTo(o2.getAuthorSurname());
                }
            });
            System.out.println(books);
        } else if (name == "patronymic") {

            Collections.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getAuthorPatronymicName().compareTo(o2.getAuthorPatronymicName());
                }
            });
            System.out.println(books);

        }
    }
}



