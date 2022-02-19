package com.doalivros.doalivros.repositories;

import java.util.UUID;

import com.doalivros.doalivros.models.UserBooksFundraisingModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserBooksFundraising extends JpaRepository<UserBooksFundraisingModel, UUID>  {
    
}
