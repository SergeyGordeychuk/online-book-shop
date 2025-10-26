package mate.academy.onlinebookshop.repository;

import java.util.List;
import mate.academy.onlinebookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book save(Book book);

    List<Book> findAll();
}
