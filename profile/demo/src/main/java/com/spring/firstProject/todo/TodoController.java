package com.spring.firstProject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	public TodoController(TodoService todoService)
	{
		super();
		this.todoService= todoService;
	}
	
	private TodoService todoService; 
	
	@RequestMapping("list-todos")
	public String ListAllTodos(ModelMap model)
	{
		List<Todo> todos  = todoService.findByUsername("AWS");
		model.addAttribute("todos", todos);
		return "listTodos";
	}

}
