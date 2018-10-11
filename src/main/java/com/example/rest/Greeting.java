package com.example.rest;
//
//import lombok.Data;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}