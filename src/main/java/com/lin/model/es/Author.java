package com.lin.model.es;

import lombok.Data;

@Data
public class Author {
    private String name;
    public Author(String name){
        this.name=name;
    }
    private Author(){

    }
}
