package com.doalivros.doalivros.repositories;
import java.util.UUID;

import com.doalivros.doalivros.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    
}
