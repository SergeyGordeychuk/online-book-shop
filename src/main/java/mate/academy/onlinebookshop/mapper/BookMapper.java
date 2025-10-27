package mate.academy.onlinebookshop.mapper;

import mate.academy.onlinebookshop.config.MapperConfig;
import mate.academy.onlinebookshop.dto.BookDto;
import mate.academy.onlinebookshop.dto.CreateBookRequestDto;
import mate.academy.onlinebookshop.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    @Mapping(target = "id", ignore = true)
    Book toEntity(CreateBookRequestDto requestDto);
}
