package pl.myspringboothibernateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.myspringboothibernateapp.dao.BookDao;
import pl.myspringboothibernateapp.model.Book;

@SpringBootApplication
public class HibernateAppSpringBootApplication {

	public static void main(String[] args) throws InterruptedException {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(HibernateAppSpringBootApplication.class, args);
		BookDao dao = ctx.getBean(BookDao.class);
		
		//CREATE
		
        Book book = new Book("1234", "CośTam", "Javastart");
        dao.save(book);
        
        //UPDATE
        Book book2 = new Book("5678", "Coś innego", "Javastop");
        book2.setId(1L);
        dao.update(book2);
        
        //READ
        System.out.println(dao.get(1L));
        
        //DELETE
        dao.remove(1L);
        
	}
}
