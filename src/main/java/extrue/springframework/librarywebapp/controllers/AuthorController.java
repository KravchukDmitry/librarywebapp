package extrue.springframework.librarywebapp.controllers;

import extrue.springframework.librarywebapp.Machine;
import extrue.springframework.librarywebapp.bootstrap.TestCustom;
import extrue.springframework.librarywebapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private TestCustom testCustom;
    @Autowired
    private BigDecimal bigDecimal;
    @Value("dima.name")
    private String string;
    @Autowired
    private Machine machine;

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        testCustom.doSomeThing();
        return "authors/list";
    }
}
