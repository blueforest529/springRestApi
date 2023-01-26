package com.example.springRestApi.service;

import com.example.springRestApi.dto.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordService {
    List<Word> getAllWords();
    Word getWord(Integer seq);
    void insertWord(Word word);
    Integer updateWord(@Param("seq") Integer seq, @Param("word") Word word);
    Integer deleteWord(Integer seq);
}
