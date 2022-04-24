package com.bookjpa.bookjpa.service;

import com.bookjpa.bookjpa.entity.Book;
import com.bookjpa.bookjpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book b){
        bookRepository.save(b);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public List<Book> getBookById(int id){

        return bookRepository.findBookById(id);
    }



}
