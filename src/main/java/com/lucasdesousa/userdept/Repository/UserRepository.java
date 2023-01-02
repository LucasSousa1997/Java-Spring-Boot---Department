package com.lucasdesousa.userdept.Repository;

import com.lucasdesousa.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
