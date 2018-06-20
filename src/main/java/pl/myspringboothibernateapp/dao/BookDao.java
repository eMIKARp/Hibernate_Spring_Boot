package pl.myspringboothibernateapp.dao;

import pl.myspringboothibernateapp.model.Book;

public interface BookDao {
	public void save(Book book);
	public Book get(Long id);

}
