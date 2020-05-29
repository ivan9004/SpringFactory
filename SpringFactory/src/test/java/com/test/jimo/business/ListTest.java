package com.test.jimo.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsCall() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void letsCallReturn() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void listGet() {
		List listMock = mock(List.class);
		//Argument Matcher
		when(listMock.get(anyInt())).thenReturn("Hola mundo");
		assertEquals("Hola mundo", listMock.get(0));
	}
	
	@Test(expected=RuntimeException.class)
	public void listException() {
		List listMock = mock(List.class);
		//Argument Matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Algo salio mal"));
		listMock.get(0);
	}

}
