package com.example.Infantspring.dto;

import com.example.Infantspring.entity.Article;

public class ArticleForm {

    private String email;
    private String password;
    private Boolean check;

    public ArticleForm(String email, Boolean check, String password) {
        this.email = email;
        this.password = password;
        this.check = check;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", check=" + check +
                '}';
    }

    public Article toEntity() {
        return new Article(null,email,password,check);
    }
}

