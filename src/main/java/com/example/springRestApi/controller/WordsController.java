package com.example.springRestApi.controller;

import com.example.springRestApi.dto.Word;
import com.example.springRestApi.service.impl.WordsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordsController {

    @Autowired
    private WordsServiceImpl service;

    @GetMapping(path = "/word")
    public List<Word> getAllWords() {
        return service.getAllWords();
    }

    @GetMapping(path = "/word/{seq}")
    public Word getWord(@PathVariable Integer seq) {
        return service.getWord(seq);
    }

    @PostMapping(path = "/word")
    public Word insertWord(@RequestBody Word word) {
        service.insertWord(word);
        return word;
    }

    @PutMapping(path = "/word/{seq}")
    public Integer updateWord(@PathVariable Integer seq, @RequestBody Word word) {
        return service.updateWord(seq, word);
    }

    @DeleteMapping(path = "/word/{seq}")
    public Integer deleteWord(@PathVariable Integer seq) {
        return service.deleteWord(seq);
    }

}
