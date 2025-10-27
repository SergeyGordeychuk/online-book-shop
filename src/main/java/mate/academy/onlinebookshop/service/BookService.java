package mate.academy.onlinebookshop.service;

import java.util.List;
import mate.academy.onlinebookshop.dto.BookDto;
import mate.academy.onlinebookshop.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findBookByid(Long id);
}
