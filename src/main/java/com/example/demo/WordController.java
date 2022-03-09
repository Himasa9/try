package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(value = "/word")
public class WordController {
    @Autowired
    WordsService wordsService;

    @RequestMapping("/search")
    public String index(WordForm wordForm, String showList, Model model) {

        if(wordForm.getId() != null) {
            EnglishWord englishWord = wordsService.findById(wordForm.getId());
            model.addAttribute("englishWord", englishWord);
        }

        if(showList != null) {
            List<EnglishWord> wordsList = wordsService.getWordsList();
            model.addAttribute("wordsList", wordsList);
        }

        return "index";

    }

}
