package com.example.Infantspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity  //DB가 해당객체를 인식 가능
public class Article {

    @Id //대표값 지정->@column안해도됨. @id가 pk설정해서
    @GeneratedValue //1,2,3..자동생성 어노테이션
    private Long id;

    @Column
    private String email;
    @Column
    private String password;
    @Column(name="is_checked")
    private Boolean check;

    public Article(Long id, String email,String password,Boolean check) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.check = check;


    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", check=" + check +
                '}';
    }
}
