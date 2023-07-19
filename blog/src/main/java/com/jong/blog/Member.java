package com.jong.blog;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED )// lombok
@AllArgsConstructor
@Getter
@Entity // jpa가 관리할 엔티티로 선언 /엔티티란 DB와 연결될 객체

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "name",nullable = false)
    private String name;
}
