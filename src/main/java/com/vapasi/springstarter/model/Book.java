package com.vapasi.springstarter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
@Getter
@NoArgsConstructor
public class Book {
    @Id
    @Column
    private Integer id;
}
