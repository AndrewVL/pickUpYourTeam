package ru.pickteam.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.pickteam.model.entities.User;
import ru.pickteam.repositories.UserRepository;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DataBaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.userRepository.save(new User("John", "Travolta", "SuperJohn", "123"));
        this.userRepository.save(new User("Arnold", "Grace", "user", "password"));
    }
}
