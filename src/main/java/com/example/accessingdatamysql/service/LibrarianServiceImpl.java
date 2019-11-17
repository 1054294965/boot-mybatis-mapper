package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.dao.LibrarianMapper;
import com.example.accessingdatamysql.entity.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrarianServiceImpl implements LibrarianService{

    @Autowired
    private LibrarianMapper librarianMapper;

    @Override
    public Librarian selectLibrarian(int id) {
        // TODO Auto-generated method stub
        return librarianMapper.selectLibrarian(id);
    }
}