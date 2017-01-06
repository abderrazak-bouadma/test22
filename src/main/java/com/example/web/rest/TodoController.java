package com.example.web.rest;

import com.example.domain.Todo;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.getAll();
    }

    @GetMapping("/{id}")
    public Todo findOne(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @PostMapping
    public Todo create(Todo t) {
        return todoService.create(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable  Long id) {
        todoService.delete(id);
    }
}
