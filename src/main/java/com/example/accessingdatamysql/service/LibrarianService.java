package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.Librarian;

public interface LibrarianService {
    Librarian selectLibrarian(int id);
}