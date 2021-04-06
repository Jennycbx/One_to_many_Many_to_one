package com.example.files_and_folders.Repositories;

import com.example.files_and_folders.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
