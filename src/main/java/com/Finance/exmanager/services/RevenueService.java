package com.Finance.exmanager.services;

import java.util.List;

import com.Finance.exmanager.model.Revenue;

public interface RevenueService {
  Revenue createRevenue(Revenue Revenue);
  Revenue getRevenue(Long id);
  List<Revenue> getAllRevenues();
  Revenue updateRevenue(Long id, Revenue Revenue);
  void deleteRevenue(Long id);
}
