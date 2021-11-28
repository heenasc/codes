package com.upgrad14.mongodbapp.resource;

import com.upgrad14.mongodbapp.model.Book;
import com.upgrad14.mongodbapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository repository;
    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Added Book with id:"+book.getId();
    }
    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){
        return repository.findAll();
    }
    @GetMapping("/findAllBooks")
    public Optional<Book> getBook(@PathVariable int id){
        return repository.findById(id);
    }
    @DeleteMapping("/deletedBook/{id}")
    public String deleteBook(@PathVariable int id){
        repository.deleteById(id);
        return "Book deleted with id :"+id;
    }

}
