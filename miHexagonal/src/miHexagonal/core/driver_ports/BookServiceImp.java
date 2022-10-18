package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.Book;
import miHexagonal.core.driven_ports.BookRepository;

public class BookServiceImp implements BookService{

	private BookRepository bookRepository;
	
	public BookServiceImp(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Book getBook(Long id) {
		
		return bookRepository.findById(id);
	}

}
