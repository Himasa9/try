package com.example.demo;

import java.util.List;

public interface EnWordDao {

    EnglishWord findById(EnglishWord englishword);

    List<EnglishWord> findAll();
}
