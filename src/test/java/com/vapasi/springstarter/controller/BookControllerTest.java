package com.vapasi.springstarter.controller;

import com.vapasi.springstarter.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BookControllerTest {

    @InjectMocks
    BookController bookController;

    @Mock
    BookRepository bookRepository;

    @Test
    public void shouldGetAllBooks() {
        assertEquals(200, bookController.getBooks().getStatusCodeValue());
        verify(bookRepository).findAll();
    }

}
