package springboot.registrationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.registrationlogin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}