package com.Finance.exmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Finance.exmanager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
