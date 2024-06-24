package com.example.demo.menu.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
public class MenuEntity {
    @Id
    private Long price;
    private String name;

    public MenuEntity(Long price, String name) {
        this.price = price;
        this.name = name;
    }

    public MenuEntity() {

    }

    public void update(Long price, String name) {
        this.price = price;
        this.name = name;
    }
}
