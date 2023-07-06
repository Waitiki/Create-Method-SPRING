package net.SACCO.MIS.Saccoappdb.controller;

import net.SACCO.MIS.Saccoappdb.entity.expenses;
import net.SACCO.MIS.Saccoappdb.repository.expensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:5173")
public class expensesController {

    @Autowired
    private expensesRepository ExpensesRepository;

    @GetMapping("/expenses")
    public List<expenses> fetchExpenses(){
        return ExpensesRepository.findAll();

    }





}
