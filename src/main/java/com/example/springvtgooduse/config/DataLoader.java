package com.example.springvtgooduse.config;

import com.example.springvtgooduse.model.User;
import com.example.springvtgooduse.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        /*for (int i=0; i <= 10000000; i++) {
            userRepository.save(new User("Alice", "alice@example.com"));
            userRepository.save(new User("Bob", "bob@example.com"));
            userRepository.save(new User("Charlie", "charlie@example.com"));
        }*/

    }
}
