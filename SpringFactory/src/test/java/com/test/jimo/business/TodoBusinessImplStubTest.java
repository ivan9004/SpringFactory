package com.test.jimo.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jimo.business.TodoBusinessImpl;
import com.jimo.data.api.TodoService;
import com.test.jimo.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		
		TodoService todoServiceStub = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}
	

}
