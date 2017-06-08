package com.viettech.springjpa;

import com.viettech.springjpa.config.SpringConfig;
import com.viettech.springjpa.entity.BookEntity;
import com.viettech.springjpa.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by tuananh on 06/08/17.
 */
public class Main {
    static ApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);
    static BookRepository bookRepository =
            (BookRepository)context.getBean("bookRepository");

    public static void main(String[] args) {
        createNewBook();
    }

    private static void createNewBook(){

        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("JAVA A-Z");
        bookEntity.setAuthor("Roger");
        bookEntity.setCategory("IT Books");
        bookEntity.setIsbn("ISIBF123");
        bookEntity.setPrice(6.5);
        bookEntity.setNumberOfPage(500);
        bookEntity.setPublishDate(new Date(1472091987000L));

        BookEntity result = bookRepository.save(bookEntity);

        if (result !=null){
            System.out.println(
                    "A new book saved successfully, book ID=" +bookEntity.getId());
        }
    }
}
