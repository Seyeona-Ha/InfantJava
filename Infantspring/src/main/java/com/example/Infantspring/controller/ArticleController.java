package com.example.Infantspring.controller;


import com.example.Infantspring.dto.ArticleForm;
import com.example.Infantspring.entity.Article; //인식이되어서 Article에 에러사라짐
import com.example.Infantspring.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired //스프링부트가 미리 생성해놓은 객체 가져다 자동연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/New")
    public String newArticleForm(){
        return "articles/New";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString()); //입력받은 값을 우리에게 보여줌

        //1.dto를 entity로 변환
        Article article=form.toEntity();
        System.out.println(article.toString());

        //2.repository에게 entity를 db에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return"";
    }
}
