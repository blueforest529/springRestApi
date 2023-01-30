package com.example.springRestApi.controller;

import com.example.springRestApi.dto.Idiom;
import com.example.springRestApi.service.impl.IdiomsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdiomsController {
    @Autowired
    private IdiomsServiceImpl service;

    @GetMapping(path = "/idiom")
    public List<Idiom> getAllIdioms() {
        return service.getAllIdioms();
    }

    @GetMapping(path = "/idiom/{seq}")
    public Idiom getIdiom(@PathVariable Integer seq) {
        return service.getIdiom(seq);
    }

    @PostMapping(path = "/idiom")
    public Idiom insertIdiom(@RequestBody Idiom idiom) {
        service.insertIdiom(idiom);
        return idiom;
    }

    @PutMapping(path = "/idiom/{seq}")
    public Integer updateIdiom(@PathVariable Integer seq, @RequestBody Idiom idiom) {
        return service.updateIdiom(seq, idiom);
    }

    @DeleteMapping(path = "/idiom/{seq}")
    public Integer deleteIdiom(@PathVariable Integer seq) {
        return service.deleteIdiom(seq);
    }
}
