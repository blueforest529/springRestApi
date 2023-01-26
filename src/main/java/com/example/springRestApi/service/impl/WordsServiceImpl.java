package com.example.springRestApi.service.impl;

import com.example.springRestApi.dao.WordsDAO;
import com.example.springRestApi.dto.Word;
import com.example.springRestApi.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsServiceImpl implements WordService {

    @Autowired
    private WordsDAO dao;


    @Override
    public List<Word> getAllWords() {
        return dao.getAllWords();
    }

    @Override
    public Word getWord(Integer seq) {
        return dao.getWord(seq);
    }

    @Override
    public void insertWord(Word word) {
        dao.insertWord(word);
    }

    @Override
    public Integer updateWord(Integer seq, Word word) {
        Word updatedWord = new Word();
        if (dao.updateWord(seq, word) == 1) {
            updatedWord.setSeq(seq);
            updatedWord.setWord(word.getWord());
            updatedWord.setParts(word.getParts());
            updatedWord.setMean(word.getMean());
        }

        return updatedWord.getSeq();
    }

    @Override
    public Integer deleteWord(Integer seq) {
        return dao.deleteWord(seq);
    }
}
