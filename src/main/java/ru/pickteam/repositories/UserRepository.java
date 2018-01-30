package ru.pickteam.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.pickteam.model.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
