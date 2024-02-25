package com.example.springbootrepetition.controller;

import com.example.springbootrepetition.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TheController {

    @GetMapping("/page1")
    public String getPage1() {
        return "???";
    }

    @GetMapping("/page2")
    public String getPage2() {
        return "???";
    }

    @GetMapping(value = "create")
    public String createTask(Model model) {
        Task emptyObject = new Task();
        model.addAttribute("task", emptyObject);
        return "createtask";
    }

    @GetMapping(value = "create2")
    public String createTask2(Model model) {
        Task emptyObject = new Task();
        model.addAttribute("task", emptyObject);
        return "createtask2";
    }

    @PostMapping(value = "save")
    public String saveTask(@ModelAttribute Task task) {
        System.out.println("Task " + task.getDescription());
        return "createtask";
    }

    @PostMapping(value = "save2")
    public String saveTask2(Task task) {
        System.out.println("Task " + task.getDescription());
        return "redirect:/create2";
    }
}
