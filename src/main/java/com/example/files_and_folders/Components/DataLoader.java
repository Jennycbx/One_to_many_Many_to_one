package com.example.files_and_folders.Components;


import com.example.files_and_folders.Models.Folder;
import com.example.files_and_folders.Models.User;
import com.example.files_and_folders.Models.File;
import com.example.files_and_folders.Repositories.UserRepository;
import com.example.files_and_folders.Repositories.FileRepository;
import com.example.files_and_folders.Repositories.FolderRepository;
import com.example.files_and_folders.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User jill = new User("Jill");
        userRepository.save(jill);

        User bob = new User("Bob");
        userRepository.save(bob);

        User sylvia = new User("Sylvia");
        userRepository.save(sylvia);

        Folder finances = new Folder("Finances", sylvia);
        folderRepository.save(finances);

        Folder house = new Folder("House", bob);
        folderRepository.save(house);

        Folder car = new Folder("Car", jill);
        folderRepository.save(car);

        File mot = new File("MOT", "txt", 8, car);
        fileRepository.save(mot);

        File tax = new File("Tax", "txt", 4, car);
        fileRepository.save(tax);

        File repairs = new File("Repairs", "ppt", 5, house);
        fileRepository.save(repairs);

        File mortgage = new File("Mortgage", "txt", 7, house);
        fileRepository.save(mortgage);

        File bills = new File("Bills", "ppt", 9, finances);
        fileRepository.save(bills);

        File savings = new File("Savings", "ppt", 12, finances);
        fileRepository.save(savings);
    }
}
