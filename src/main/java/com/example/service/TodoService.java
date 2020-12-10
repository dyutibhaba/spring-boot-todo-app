package com.example.service;

import com.example.model.TodoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    //There methods will be called from Controller methods
    public List<TodoModel> getTodoList() {

        //Add your code here and return the model e.g., here TodoModel
        return List.of(new TodoModel("Some data"));

    }
}
