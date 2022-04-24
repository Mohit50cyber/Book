package com.bookjpa.bookjpa.controller;

import com.bookjpa.bookjpa.entity.Book;
import com.bookjpa.bookjpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

      @Autowired
      private BookService bookService;

      @PostMapping("/books")
      public String saveBook(@RequestBody Book book){
           bookService.addBook(book);
           return "saved";
      }
      @GetMapping("/books")
      public List<Book> getBooks(){

          return bookService.getAllBooks();
      }
      @GetMapping("/books/{id}")
      public List<Book> getBookById(@PathVariable int id){

          return bookService.getBookById(id);
      }
}
