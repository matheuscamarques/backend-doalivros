package com.doalivros.doalivros.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Table(name = "users_books")
public class UserBooksModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "total_asset_value", nullable = false)
    private Integer totalAssetValue;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Column(name= "updated_by", nullable = true)
    private UUID updatedBy;

    @Column(name= "deleted_by", nullable = true)
    private UUID deletedBy;

    @Column(name = "created_by", nullable = false)
    private UUID createdBy;

}
