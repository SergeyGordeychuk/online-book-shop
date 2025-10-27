package mate.academy.onlinebookshop.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.onlinebookshop.dto.BookDto;
import mate.academy.onlinebookshop.dto.CreateBookRequestDto;
import mate.academy.onlinebookshop.mapper.BookMapper;
import mate.academy.onlinebookshop.model.Book;
import mate.academy.onlinebookshop.repository.BookRepository;
import mate.academy.onlinebookshop.service.BookService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = new Book();
        book.setTitle(requestDto.getTitle());
        book.setAuthor(requestDto.getAuthor());
        book.setIsbn(requestDto.getIsbn());
        book.setPrice(requestDto.getPrice());
        book.setDescription(requestDto.getDescription());
        book.setCoverImage(requestDto.getCoverImage());

        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto findBookByid(Long id) {
        return bookMapper.toDto(bookRepository.findById(id).get());
    }
}
