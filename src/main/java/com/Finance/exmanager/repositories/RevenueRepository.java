package com.Finance.exmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Finance.exmanager.model.Revenue;

@Repository
public interface RevenueRepository extends JpaRepository<Revenue, Long> {
    // Add custom query methods if needed
}
