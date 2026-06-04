package ch11;

class Book {
    String title;
    String author;

    Book() {
        this("제목미상","작가미상");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("자바를 자바라!", "용쌤");

        System.out.println("제목: " + book1.title + ", 작가: " + book1.author);
        System.out.println("제목: " + book2.title + ", 작가: " + book2.author);
    }
}
