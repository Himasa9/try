package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EnWordDao {

    EnglishWord findById(EnglishWord englishword);

    List<EnglishWord> findAll();
}
