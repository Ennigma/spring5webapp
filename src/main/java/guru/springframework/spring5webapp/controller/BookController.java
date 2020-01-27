package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import guru.springframework.spring5webapp.repositories.BookRepository;

/* eserbaniuc created on 01/27/2020 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "book";
    }
}