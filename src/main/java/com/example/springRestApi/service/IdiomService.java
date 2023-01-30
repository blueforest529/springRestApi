package com.example.springRestApi.service;

import com.example.springRestApi.dto.Idiom;
import com.example.springRestApi.dto.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IdiomService {
    List<Idiom> getAllIdioms();
    Idiom getIdiom(Integer seq);
    void insertIdiom(Idiom idiom);
    Integer updateIdiom(@Param("seq") Integer seq, @Param("idiom") Idiom idiom);
    Integer deleteIdiom(Integer seq);
}
