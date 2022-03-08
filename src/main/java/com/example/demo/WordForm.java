package com.example.demo;

import lombok.Data;

@Data
public class WordForm {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
