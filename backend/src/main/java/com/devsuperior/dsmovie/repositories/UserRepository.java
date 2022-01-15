package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //Método do spring data JPA (buscar usuario por email)
    User findByEmail(String email);

}
