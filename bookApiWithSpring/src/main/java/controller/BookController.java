	package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Book;
import service.BookService;


@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	 
	//Get all the books with get method
	@GetMapping("/api/book")  
	public ResponseEntity<List<Book>> list(){
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
	
	
	
	//Save the book with post method
	@PostMapping("/api/book")  
	public ResponseEntity<Book> save(@RequestBody Book book){
		Book new_book = bookService.save(book);
		return ResponseEntity.ok().body(new_book);
		
	}
	
	//Get a single record 
	@GetMapping("/api/book/{id}")
	public ResponseEntity<Book> get(@PathVariable("id") long id){
		Book book = bookService.get(id);
		return ResponseEntity.ok().body(book);
	}
	
	
	//Update the book record
	@PutMapping("/api/book/{id}")
	public ResponseEntity<Book> update(@PathVariable("id") long id,@RequestBody Book book){
		Book updated_book = bookService.update(id,book);
		return ResponseEntity.ok().body(updated_book);  
	}
	
	
	//Delete a book record
	@DeleteMapping("/api/book/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id){
		bookService.delete(id);
		return ResponseEntity.ok().body(id);
	}
	
}
