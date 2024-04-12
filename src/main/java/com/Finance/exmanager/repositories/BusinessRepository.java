package com.Finance.exmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Finance.exmanager.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {
    // Add custom query methods if needed
}