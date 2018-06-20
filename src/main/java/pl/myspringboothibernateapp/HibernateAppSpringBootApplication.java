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
        Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
        dao.save(book);
        Thread.sleep(5000);
	}
}
