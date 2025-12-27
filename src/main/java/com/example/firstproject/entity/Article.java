package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor //기본 생성자
@ToString
@Entity //엔티티임을 선언함 (DB의 테이블 이름 = 엔티티 클래스 이름)
public class Article {
    @Id //엔티티 객체별 개별 대푯값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 id 자동 생성
    //id 숫자 자동으로 매겨짐
    private Long id;
    @Column
    private String title; //title 필드 선언 (DB테이블의 title열)
    @Column
    private String content; //content 필드 선언 (DB 테이블의 content열과 연결)

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }


    public void patch(Article article) {
        if(article.title != null)
            this.title = article.title;
        if(article.content != null)
            this.content = article.content;
    }
}
