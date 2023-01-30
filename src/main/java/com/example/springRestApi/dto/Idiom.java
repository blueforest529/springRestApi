package com.example.springRestApi.dto;

public class Idiom {
    private Integer seq;
    private String idiom;
    private String mean;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getIdiom() {
        return idiom;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return "Idiom{" +
                "seq=" + seq +
                ", idiom='" + idiom + '\'' +
                ", mean='" + mean + '\'' +
                '}';
    }
}
