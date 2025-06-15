package com.example.Infantspring.repository;

import com.example.Infantspring.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {

}  //관리대상 entity, 대표값의 type
