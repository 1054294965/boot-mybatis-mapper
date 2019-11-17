package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.entity.Librarian;
import com.example.accessingdatamysql.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @GetMapping("/getLibrarian")
    public Librarian getALibrarianInfo(int id) {
        //System.out.println("test :id: "+id);
        return librarianService.selectLibrarian(id);
    }
}