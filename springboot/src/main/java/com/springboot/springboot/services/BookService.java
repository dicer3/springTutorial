package com.springboot.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.jdbc.Expectations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springboot.dao.BookRepository;
import com.springboot.springboot.entities.Book;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    // get all books
    public List<Book> getAllBooks(){
           return (List<Book>)this.bookRepository.findAll();
    }

    // get single book handler
    public Book getBookById(int id){
        System.out.println("coming");
        Book book = null;
        try {
           return this.bookRepository.findById(id);
           //book = list.stream().filter(e-> e.getId() == id ).findFirst().get();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // new book handler
    public Book addBook(Book b){
        //list.add(b);
        Book result = bookRepository.save(b);
        return result;
    }

    // delete book handler
    public void deleteBook(int bid) {
        // list = list.stream().filter(book->  book.getId() == bid).collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }

    public void updateBook(Book book,int bookId){
        // list = list.stream().map(b->{
        //     if(b.getId() == bookId){
        //        b.setTitle(book.getTitle());
        //        b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        //book.setId(bookId);
        bookRepository.save(book);
    }
}
