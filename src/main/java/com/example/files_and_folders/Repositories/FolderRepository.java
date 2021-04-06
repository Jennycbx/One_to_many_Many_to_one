package com.example.files_and_folders.Repositories;

import com.example.files_and_folders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
