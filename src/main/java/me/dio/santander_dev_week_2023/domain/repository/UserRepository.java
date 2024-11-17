package me.dio.santander_dev_week_2023.domain.repository;

import me.dio.santander_dev_week_2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
