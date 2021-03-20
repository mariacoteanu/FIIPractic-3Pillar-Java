package training3;

import java.util.*;

class Book implements Comparable<Book>{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class SortByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
public class ToDo {
    public static void main(String[] args) {
        //List<Book> books = new LinkedList<>();

        Book b1 = new Book("Poezii", "Mihai Eminescu");
        Book b2 = new Book("Poezii", "George Cosbuc");
        Book b3 = new Book("Arta culinara", "Jamila");
        Book b4 = new Book("Raraul", "Ion Ion");


//        books.add(b1);
//        books.add(b4);
//        books.add(b3);
//        books.add(b2);
        List<Book> books = Arrays.asList(b1,b2,b3,b4);

        System.out.println(books);

        Collections.sort(books, new SortByAuthor());
        System.out.println(books);

    }
}
