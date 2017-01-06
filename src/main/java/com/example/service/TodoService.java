package com.example.service;


import com.example.domain.Todo;
import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findOne(id);
    }

    @Transactional
    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    @Transactional
    public void delete(Long id) {
        Todo one = todoRepository.findOne(id);
        if (one==null)
            throw new IllegalArgumentException();
        todoRepository.delete(id);
    }
}
