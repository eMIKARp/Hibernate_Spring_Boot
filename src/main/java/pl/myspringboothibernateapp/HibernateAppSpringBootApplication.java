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
        Book book = new Book("10468", "Emil", "Javastart");
        dao.save(book);
        System.out.println(dao.get(1L));
        
	}
}
