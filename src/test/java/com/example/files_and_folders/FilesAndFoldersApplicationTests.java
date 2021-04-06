package com.example.files_and_folders;

import com.example.files_and_folders.Models.Folder;
import com.example.files_and_folders.Models.User;
import com.example.files_and_folders.Models.File;
import com.example.files_and_folders.Repositories.FileRepository;
import com.example.files_and_folders.Repositories.FolderRepository;
import com.example.files_and_folders.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createUserAndFileAndFolder(){
		User user = new User("Claire");
		userRepository.save(user);

		Folder folder = new Folder("Wedding", user);
		folderRepository.save(folder);

		File cake = new File("Jack", "Sparrow", 32, folder);
		fileRepository.save(cake);
	}

}
