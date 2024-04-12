package com.Finance.exmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Finance.exmanager.DTO.BusinessDTO;
import com.Finance.exmanager.model.Business;
import com.Finance.exmanager.util.DTOMapper;

import com.Finance.exmanager.services.BusinessService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @PostMapping
    public ResponseEntity<BusinessDTO> createBusiness(@RequestBody BusinessDTO businessDTO) {
      Business business = DTOMapper.BusinessMapper.mapFromBusiness(businessDTO);
      Business savedBusiness = businessService.createBusiness(business);
      return new ResponseEntity<>(DTOMapper.BusinessMapper.mapToBusiness(savedBusiness), HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BusinessDTO> getBusiness(@PathVariable Long id) {
      Business business = businessService.getBusiness(id);
      return ResponseEntity.ok(DTOMapper.BusinessMapper.mapToBusiness(business));
  }

  @GetMapping
  public ResponseEntity<List<BusinessDTO>> getAllBusinesses() {
      List<Business> businesses = businessService.getAllBusinesses();
      List<BusinessDTO> businessDTOs = businesses.stream()
              .map(DTOMapper.BusinessMapper::mapToBusiness)
              .collect(Collectors.toList());
      return ResponseEntity.ok(businessDTOs);
  }

  @PutMapping("/{id}")
  public ResponseEntity<BusinessDTO> updateBusiness(@PathVariable Long id, @RequestBody BusinessDTO businessDTO) {
      Business business = DTOMapper.BusinessMapper.mapFromBusiness(businessDTO);
      Business updatedBusiness = businessService.updateBusiness(id, business);
      return ResponseEntity.ok(DTOMapper.BusinessMapper.mapToBusiness(updatedBusiness));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBusiness(@PathVariable Long id) {
      businessService.deleteBusiness(id);
      return ResponseEntity.noContent().build();
  }
}
