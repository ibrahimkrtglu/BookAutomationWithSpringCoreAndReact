package service;

import java.util.List;

import model.Book;

public interface BookService {

		//Save the record
		Book save(Book book);
		
		
		//get single record
		Book get(long id);
		
		//get all the records
		List<Book> list(); 
		
		//Update the record
		Book update(long id,Book book);
		
		
		//Delete a record
		void delete(long id);
	
}
