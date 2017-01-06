package com.example;

import com.example.domain.Todo;
import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class FakeData implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        Todo t = new Todo();
        t.setTitle("Learn Spring Boot");
        todoRepository.save(t);

        t = new Todo();
        t.setTitle("Learn Rasp");
        todoRepository.save(t);

        t = new Todo();
        t.setTitle("KelEllouz");
        todoRepository.save(t);
    }
}
