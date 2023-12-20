package com.springboot.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springboot.springboot.entities.Book;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12,"Java Complete Refernce","XYZ"));
        list.add(new Book(36,"Head First to Java","ABC"));
        list.add(new Book(12396,"Think in java","LMN"));
        System.out.println("list in static "+list);
    }

    // get all books
    public List<Book> getAllBooks(){
        System.out.println("list "+list);
        return list;
    }

    // get single book handler
    public Book getBookById(int id){
        Book book;
        book = list.stream().filter(e-> e.getId() == id ).findFirst().get();
        return book;
    }

    // new book handler
    public Book addBook(Book b){
        list.add(b);
        return b;
    }

    // delete book handler
    public void deleteBook(int bid) {
        list = list.stream().filter(book->  book.getId() == bid).collect(Collectors.toList());
    }

    public void updateBook(Book book,int bookId){
        list = list.stream().map(b->{
            if(b.getId() == bookId){
               b.setTitle(book.getTitle());
               b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
