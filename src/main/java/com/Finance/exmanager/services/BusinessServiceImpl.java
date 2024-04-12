package com.Finance.exmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Finance.exmanager.model.Business;
import com.Finance.exmanager.repositories.BusinessRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public Business createBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Business getBusiness(Long id) {
        return businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found"));
    }

    @Override
    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    @Override
    public Business updateBusiness(Long id, Business updatedBusiness) {
        Business business = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found"));

        business.setBusinessName(updatedBusiness.getBusinessName());
        business.setBusinessType(updatedBusiness.getBusinessType());

        return businessRepository.save(business);
    }

    @Override
    public void deleteBusiness(Long id) {
        Business business = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found"));
        businessRepository.delete(business);
    }
}
