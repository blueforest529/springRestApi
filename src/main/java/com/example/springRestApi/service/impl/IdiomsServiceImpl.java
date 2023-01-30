package com.example.springRestApi.service.impl;

import com.example.springRestApi.dao.IdiomsDAO;
import com.example.springRestApi.dto.Idiom;
import com.example.springRestApi.service.IdiomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdiomsServiceImpl implements IdiomService {

    @Autowired
    private IdiomsDAO dao;

    @Override
    public List<Idiom> getAllIdioms() {
        return dao.getAllIdioms();
    }

    @Override
    public Idiom getIdiom(Integer seq) {
        return dao.getIdiom(seq);
    }

    @Override
    public void insertIdiom(Idiom idiom) {
        dao.insertIdiom(idiom);
    }

    @Override
    public Integer updateIdiom(Integer seq, Idiom idiom) {
        Idiom updatedIdiom = new Idiom();
        if (dao.updateIdiom(seq, idiom) == 1) {
            updatedIdiom.setSeq(seq);
            updatedIdiom.setIdiom(idiom.getIdiom());
            updatedIdiom.setMean(idiom.getMean());
        }

        return updatedIdiom.getSeq();
    }

    @Override
    public Integer deleteIdiom(Integer seq) {
        return dao.deleteIdiom(seq);
    }
}
