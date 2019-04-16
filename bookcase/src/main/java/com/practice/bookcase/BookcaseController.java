package com.practice.bookcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookcaseController {

    Book book = new Book();

    private static int count = 0;

//    private void init() {
//        if(count < 1){
//            Book.addNewBook(new Book(1,"To Kill a Mocking Bird", "Harper Lee","1960"));
//            Book.addNewBook(new Book(2,"Pride and Prejudice", "Jane Austen","1813"));
//            Book.addNewBook(new Book(3,"Of Mice and Men", "John Steinbeck","1937"));
//        }
//    }

    @GetMapping("/viewBooks")
    public String viewBooks(Model model){
//        init();
        book.getAllBooks();
        model.addAttribute("book", Book.books);
        return "viewBooks";
    }

    @GetMapping("/addBook")
    public String addBook(Model model){
        int nextID = Book.books.size() + 1;
        System.out.println(nextID);
        Book book = new Book();
        book.setBookID(nextID);
        model.addAttribute("book", book);
        return "addBook";
    }

    @PostMapping("/bookAdded")
    public String bookAdded(@ModelAttribute Book book){
        Book.addNewBook(book);
        return "index";
    }
}
