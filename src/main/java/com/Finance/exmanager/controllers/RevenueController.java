package com.Finance.exmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Finance.exmanager.DTO.RevenueDTO;
import com.Finance.exmanager.model.Revenue;
import com.Finance.exmanager.util.DTOMapper.RevenueMapper;

import com.Finance.exmanager.services.RevenueService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/revenues")
public class RevenueController {
    @Autowired
    private RevenueService revenueService;

    @PostMapping
    public ResponseEntity<RevenueDTO> createRevenue(@RequestBody RevenueDTO revenueDTO) {
        Revenue revenue = RevenueMapper.mapFromRevenue(revenueDTO);
        Revenue savedRevenue = revenueService.createRevenue(revenue);
        return new ResponseEntity<>(RevenueMapper.mapToRevenue(savedRevenue), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RevenueDTO> getRevenue(@PathVariable Long id) {
        Revenue revenue = revenueService.getRevenue(id);
        return ResponseEntity.ok(RevenueMapper.mapToRevenue(revenue));
    }

    @GetMapping
    public ResponseEntity<List<RevenueDTO>> getAllRevenues() {
        List<Revenue> revenues = revenueService.getAllRevenues();
        List<RevenueDTO> revenueDTOs = revenues.stream()
                .map(RevenueMapper::mapToRevenue)
                .collect(Collectors.toList());
        return ResponseEntity.ok(revenueDTOs);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RevenueDTO> updateRevenue(@PathVariable Long id, @RequestBody RevenueDTO revenueDTO) {
        Revenue revenue = RevenueMapper.mapFromRevenue(revenueDTO);
        Revenue updatedRevenue = revenueService.updateRevenue(id, revenue);
        return ResponseEntity.ok(RevenueMapper.mapToRevenue(updatedRevenue));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRevenue(@PathVariable Long id) {
        revenueService.deleteRevenue(id);
        return ResponseEntity.noContent().build();
    }
}
