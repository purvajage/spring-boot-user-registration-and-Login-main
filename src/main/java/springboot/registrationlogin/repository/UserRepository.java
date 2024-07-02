package springboot.registrationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.registrationlogin.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}