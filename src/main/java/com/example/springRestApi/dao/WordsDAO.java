package com.example.springRestApi.dao;

import com.example.springRestApi.dto.Word;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordsDAO {
    List<Word> getAllWords();
    Word getWord(Integer seq);
    void insertWord(Word word);
    Integer updateWord(@Param("seq") Integer seq, @Param("word") Word word);
    Integer deleteWord(Integer seq);
}
