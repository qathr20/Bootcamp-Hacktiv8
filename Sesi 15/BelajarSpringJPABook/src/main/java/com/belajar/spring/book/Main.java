package com.belajar.spring.book;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	Logger logger = Logger.getLogger(Main.class.getName());

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = new Book();
		book1.setTitle("Belajar Spring Boot");
		book1.setWriter("Fatur Baik");
		book1.setIsbn("IS-90907");

		Book book2 = new Book();
		book2.setTitle("Belajar JPA");
		book2.setWriter("Daniel");
		book2.setIsbn("IS-90908");

		Book book3 = new Book();
		book3.setTitle("Belajar Lagi");
		book3.setWriter("Jason");
		book3.setIsbn("IS-90909");

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);

		
		final String title = "Belajar Spring Boot";
		List<Book> byTitle = bookRepository.findByTitle(title);
		logger.log(Level.INFO, "Title : " + byTitle);


		List<Book> books = bookRepository.findAll();
		logger.log(Level.INFO, "Books : " + books);


		final String writer = "Fatur Baik";
		List<Book> byWriter = bookRepository.findAllByWriter(writer);
		logger.log(Level.INFO, "Writer : " + byWriter);


		final String isbn = "IS-90907";
		List<Book> byIsbn = bookRepository.findByIsbn(isbn);
		logger.log(Level.INFO, "ISBN : " + byIsbn);


		List<Book> nativeBooksQuery = bookRepository.findAllQueryNative();
		logger.log(Level.INFO, "Book by native query : " + nativeBooksQuery);


		final String nativeWriter = "Daniel";
		List<Book> byNativeWriter = bookRepository.findAllByWriterQueryNative(nativeWriter);
		logger.log(Level.INFO, "Writer by native query : " + byNativeWriter);


		BookCategory bookCategory = bookCategoryRepository.save(
				new BookCategory("Ilmiah",
				new Book("Antologi", "Teten Tettew", "SEI92002"), 
				new Book("Filosofi", "Lilis Gelis", "UEOEI829"))
		);
		logger.log(Level.INFO, "bookCategory : " + bookCategory);
	}

}
