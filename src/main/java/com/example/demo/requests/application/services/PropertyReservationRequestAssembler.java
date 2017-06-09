package com.example.demo.requests.application.services;

import com.example.demo.common.services.BusinessPeriodAssembler;
import com.example.demo.inventory.application.dto.PropertyDTO;
import com.example.demo.inventory.application.services.PropertyAssembler;
import com.example.demo.inventory.domain.model.Property;
import com.example.demo.inventory.rest.controller.InventoryRestController;
import com.example.demo.requests.application.dto.PropertyReservationRequestDTO;
import com.example.demo.requests.domain.model.PropertyReservationRequest;
import com.example.demo.requests.rest.RequestsRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;

/**
 * Created by Meri on 08-Mar-17.
 */
@Service
public class PropertyReservationRequestAssembler extends ResourceAssemblerSupport<PropertyReservationRequest, PropertyReservationRequestDTO> {
    @Autowired
    BusinessPeriodAssembler bpAssembler;

    @Autowired
    PropertyAssembler pAssembler;

    public PropertyReservationRequestAssembler() {
        super(RequestsRestController.class, PropertyReservationRequestDTO.class);
    }

    public PropertyReservationRequestDTO toResource(PropertyReservationRequest prr) {
        PropertyReservationRequestDTO dto = createResourceWithId(prr.getId(), prr);
        dto.setPropertyDTO(pAssembler.toResource(prr.getProperty()));
        dto.setReservationPeriodDTO(bpAssembler.toResource(prr.getReservationPeriod()));

        return dto;
    }

    public PropertyReservationRequest toEntity(PropertyReservationRequestDTO prrDTO) {
        PropertyReservationRequest prr = PropertyReservationRequest.of(prrDTO.get_id(), bpAssembler.toEntity(prrDTO.getReservationPeriodDTO()), pAssembler.toEntity(prrDTO.getPropertyDTO()));

        return prr;
    }
}
