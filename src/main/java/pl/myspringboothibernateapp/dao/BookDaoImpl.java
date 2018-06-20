package pl.myspringboothibernateapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.myspringboothibernateapp.model.Book;

@Repository
public class BookDaoImpl implements BookDao{

	@PersistenceContext
	private EntityManager entityManager;

	public BookDaoImpl() {
	}
	
	@Override
	@Transactional
	public void save(Book book) {
		entityManager.persist(book);
	}

	@Override
	public Book get(Long id) {
		Book book = entityManager.find(Book.class, id);
		entityManager.close();
		return book;
	}

}
