package bookStudent.data;

import java.util.Objects;

public class Book {

    private String name = null;
    private int age = 0;
    private String author = null;
    private String type = null;

    private String authorName = null;
    private String authorSurname = null;
    private String authorPatronymicName = null;

    public Book() {

    }

    public Book(String name, int age, String author, String type, String authorName, String authorSurname, String authorPatronymicName) {
        this.name = name;
        this.age = age;
        this.author = author;
        this.type = type;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorPatronymicName = authorPatronymicName;
    }

    public Book(String name, int age, String author, String type) {
        this.name = name;
        this.age = age;
        this.author = author;
        this.type = type;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorPatronymicName() {
        return authorPatronymicName;
    }

    public void setAuthorPatronymicName(String authorPatronymicName) {
        this.authorPatronymicName = authorPatronymicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && name.equals(book.name) && author.equals(book.author) && type.equals(book.type) && authorName.equals(book.authorName) && authorSurname.equals(book.authorSurname) && authorPatronymicName.equals(book.authorPatronymicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, author, type, authorName, authorSurname, authorPatronymicName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorPatronymicName='" + authorPatronymicName + '\'' +
                '}' + "\n";
    }

}
