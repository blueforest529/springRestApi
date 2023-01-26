package com.example.springRestApi.dto;

public class Word {

    private Integer seq;
    private String word;
    private String parts;
    private String mean;

    public Word() {
        super();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return "Word {" +
                "seq=" + seq +
                ", word='" + word + '\'' +
                ", parts='" + parts + '\'' +
                ", mean='" + mean + '\'' +
                '}';
    }

}
