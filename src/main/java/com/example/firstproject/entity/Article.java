package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //기본 생성자
@ToString
@Entity //엔티티임을 선언함 (DB의 테이블 이름 = 엔티티 클래스 이름)
public class Article {
    @Id //엔티티 객체별 개별 대푯값 지정
    @GeneratedValue //id 숫자 자동으로 매겨짐
    private Long id;
    @Column
    private String title; //title 필드 선언 (DB테이블의 title열)
    @Column
    private String content; //content 필드 선언 (DB 테이블의 content열과 연결)
}
