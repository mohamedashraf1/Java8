package example;


import java.util.Collections;
import java.util.List;

public class NewBookService {

    public List<Book> getBooksInSort(){
        List<Book> books =  new BookDAD().getBooks();
        Collections.sort(books, (book1, book2) -> book2.getName().compareTo(book1.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new NewBookService().getBooksInSort());
    }
}

