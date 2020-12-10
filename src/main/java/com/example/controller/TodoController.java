package com.example.controller;

import com.example.model.TodoModel;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    //Inject your service [Service is something where all your business logic or actual function with logic sits]
    @Autowired
    private TodoService todoService;


    //For this method the url will be http://localhost:8080/api/todo-list. Call this url from browser or postman [Run the app before hand :P]
    // Add methods like below to get or post data with a unique path (url)
    @GetMapping("/todo-list")
    public ResponseEntity<List<TodoModel>> getTodoList() {
        //call the service class method/function here
        List<TodoModel> todoList = todoService.getTodoList();
        return new ResponseEntity<>(todoList, HttpStatus.OK);
    }
}
