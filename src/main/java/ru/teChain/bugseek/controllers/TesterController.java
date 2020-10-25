package ru.teChain.bugseek.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.teChain.bugseek.daomodels.TestersDao;
import ru.teChain.bugseek.models.Tester;

@Controller
@RequestMapping("/tester")
public class TesterController {
    private final TestersDao TesterDAO;
    @Autowired
    public TesterController(TestersDao testersDao) {
        this.TesterDAO = testersDao;
    }
    @GetMapping()
    public String index(Model model) {
        model.addAttribute("tester", TesterDAO.index());
        return "tester/index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", TesterDAO.show(id));
        return "people/show";
    }
    @GetMapping("/new")
    public String newContoller(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personDAO.save(person);
        return "redirect:/people";
    }
}
