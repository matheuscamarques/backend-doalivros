package com.doalivros.doalivros.repositories;
import java.util.UUID;

import com.doalivros.doalivros.models.UserBooksModel;

import org.springframework.data.jpa.repository.JpaRepository;
public interface IUserBooksRepository extends JpaRepository<UserBooksModel, UUID> {

}
    