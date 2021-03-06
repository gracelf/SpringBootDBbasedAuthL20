package me.grace.springboot17.repositories;

import me.grace.springboot17.models.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepo extends CrudRepository<Role, Long>{
    Role findByRole(String role);
}
