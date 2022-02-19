package com.doalivros.doalivros.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "users_books_fundraising")
public class UserBooksFundraisingModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

    @Column(name = "user_book_id", nullable = false)
    private UUID userBookId;

    @Column(name = "asset_value", nullable = false)
    private Integer assetValue;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    
}
