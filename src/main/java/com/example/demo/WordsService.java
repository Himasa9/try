package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WordsService {

    @Autowired
    EnWordDao enWordDao;

    //1件検索
    public EnglishWord findById(Integer id) {
        EnglishWord englishWord = new EnglishWord();
        englishWord.setId(id);
        return this.enWordDao.findById(englishWord);
    }

    //全件取得
    public List<EnglishWord> getWordsList() {
        return this.enWordDao.findAll();
    }
}
