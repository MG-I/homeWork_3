package bookStudent;

import bookStudent.data.Book;
import bookStudent.data.Student;
import bookStudent.util.UtilBook;
import bookStudent.util.UtilSortBook;
import bookStudent.util.UtilStudent;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Book> listBook = UtilBook.generationBook();

        System.out.println(listBook);
        listBook.remove(7);
        System.out.println("--------------------------------");
        System.out.println(listBook);

        UtilSortBook.sortName("patronymic");
        UtilSortBook.sortName("name");
        UtilSortBook.sortName("surname");

        HashSet<Book> listBookHash = UtilBook.generationBookTwo();

        for (Book book : listBookHash) {
            String nameBook = book.getName();
            if (nameBook.matches("(?i)^[aeiouy].*$")) {
                System.out.println(book);
            }
        }

        TreeSet<Student> students = UtilStudent.generationStudent();
        UtilStudent.getStudents(students);


    }

}

