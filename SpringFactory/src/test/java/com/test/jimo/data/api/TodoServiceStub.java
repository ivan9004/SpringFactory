package com.test.jimo.data.api;

import java.util.Arrays;
import java.util.List;

import com.jimo.data.api.TodoService;


//Dynamic conditions
//Service Definitions
public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}

}
