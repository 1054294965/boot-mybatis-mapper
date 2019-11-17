package com.example.accessingdatamysql.dao;

import com.example.accessingdatamysql.entity.Librarian;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LibrarianMapper {
    Librarian selectLibrarian(int id);
}