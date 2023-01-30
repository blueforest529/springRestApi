package com.example.springRestApi.dao;

import com.example.springRestApi.dto.Idiom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdiomsDAO {
    List<Idiom> getAllIdioms();
    Idiom getIdiom(Integer seq);
    void insertIdiom(Idiom idiom);
    Integer updateIdiom(@Param("seq") Integer seq, @Param("idiom") Idiom idiom);
    Integer deleteIdiom(Integer seq);
}
