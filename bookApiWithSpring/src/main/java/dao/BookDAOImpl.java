package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Book;


@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Book save(Book book) {
		sessionFactory.getCurrentSession().save(book);
		return book;
	}

	@Override
	public Book get(long id) {
	return sessionFactory.getCurrentSession().get(Book.class,id); 
	}

	@Override
	public List<Book> list() {
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		return list;
	}

	@Override
	public Book update(long id, Book book) {
		Session session = sessionFactory.getCurrentSession();
		Book oldBook = session.byId(Book.class).load(id);
		oldBook.setTitle(book.getTitle());
		oldBook.setAuthor(book.getAuthor());
		session.flush();
		return oldBook;
	}

	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book=session.byId(Book.class).load(id);
		session.delete(book);
	}

}
