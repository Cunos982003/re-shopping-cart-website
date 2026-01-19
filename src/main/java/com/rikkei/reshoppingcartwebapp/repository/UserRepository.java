package com.rikkei.reshoppingcartwebapp.repository;

import com.rikkei.reshoppingcartwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
