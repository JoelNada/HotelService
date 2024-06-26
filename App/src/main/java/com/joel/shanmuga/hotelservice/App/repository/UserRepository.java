package com.joel.shanmuga.hotelservice.App.repository;

import com.joel.shanmuga.hotelservice.App.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
