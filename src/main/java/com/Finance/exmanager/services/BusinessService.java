package com.Finance.exmanager.services;

import java.util.List;

import com.Finance.exmanager.model.Business;

public interface BusinessService {
  Business createBusiness(Business business);
  Business getBusiness(Long id);
  List<Business> getAllBusinesses();
  Business updateBusiness(Long id, Business business);
  void deleteBusiness(Long id);
}
