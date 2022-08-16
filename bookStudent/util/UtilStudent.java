package bookStudent.util;

import bookStudent.data.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class UtilStudent {


    public static TreeSet<Student> generationStudent() {

        int maxAge = 17;
        int minAge = 15;
        TreeSet<Student> students = new TreeSet<>();
        for (int i = 1; i < 11; i++) {
            int age = minAge + (int) (Math.random() * (maxAge - minAge));
            int curs = 1 + (int) (Math.random() * (5 - 1));
            Student student = new Student(i, "Name" + i, age, curs);
            students.add(student);
        }

        return students;
    }

    public static void getStudents(TreeSet<Student> students) {

        List<Student> list = new LinkedList<>();

        Iterator<Student> iterator = students.iterator();


        while (iterator.hasNext()) {
            int a = iterator.next().getId();
            if (a % 2 != 0) {
                list.add(iterator.next());
            }
        }

        TreeSet<Student> studentsTwo = new TreeSet<>();
        studentsTwo.addAll(list);

        System.out.println(studentsTwo);
    }
}
