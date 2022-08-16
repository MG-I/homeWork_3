package bookStudent.data;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;
    private int curs;

    public Student() {

    }

    public Student(int id, String name, int age, int curs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.curs = curs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && curs == student.curs && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, curs);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", curs=" + curs +
                '}' + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
