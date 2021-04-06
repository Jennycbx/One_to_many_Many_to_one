package com.example.files_and_folders.Repositories;

import com.example.files_and_folders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
