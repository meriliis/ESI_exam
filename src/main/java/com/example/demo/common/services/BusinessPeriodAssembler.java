package com.example.demo.common.services;

import com.example.demo.common.application.dto.BusinessPeriodDTO;
import com.example.demo.common.domain.model.BusinessPeriod;
import org.springframework.stereotype.Service;

/**
 * Created by Meri on 08-Mar-17.
 */
@Service
public class BusinessPeriodAssembler {
    public BusinessPeriodDTO toResource(BusinessPeriod bp) {
        BusinessPeriodDTO dto = new BusinessPeriodDTO();
        dto.setStartDate(bp.getStartDate());
        dto.setEndDate(bp.getEndDate());
        return dto;
    }

    public BusinessPeriod toEntity(BusinessPeriodDTO bpDTO) {
        BusinessPeriod bp = BusinessPeriod.of(bpDTO.getStartDate(), bpDTO.getEndDate());
        return bp;
    }
}
