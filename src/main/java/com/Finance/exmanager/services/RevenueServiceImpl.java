package com.Finance.exmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Finance.exmanager.model.Revenue;
import com.Finance.exmanager.repositories.RevenueRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RevenueServiceImpl implements RevenueService {
    @Autowired
    private RevenueRepository revenueRepository;

    @Override
    public Revenue createRevenue(Revenue revenue) {
        return revenueRepository.save(revenue);
    }

    @Override
    public Revenue getRevenue(Long id) {
        return revenueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Revenue not found"));
    }

    @Override
    public List<Revenue> getAllRevenues() {
        return revenueRepository.findAll();
    }

    @Override
    public Revenue updateRevenue(Long id, Revenue updatedRevenue) {
        Revenue revenue = revenueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Revenue not found"));

        revenue.setProductName(updatedRevenue.getProductName());
        revenue.setQuantitySold(updatedRevenue.getQuantitySold());
        revenue.setSalePrice(updatedRevenue.getSalePrice());
        revenue.setSaleDate(updatedRevenue.getSaleDate());

        return revenueRepository.save(revenue);
    }

    @Override
    public void deleteRevenue(Long id) {
        Revenue revenue = revenueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Revenue not found"));
        revenueRepository.delete(revenue);
    }
}
