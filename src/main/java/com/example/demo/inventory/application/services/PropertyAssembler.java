package com.example.demo.inventory.application.services;

import com.example.demo.common.application.dto.BusinessPeriodDTO;
import com.example.demo.common.domain.model.BusinessPeriod;
import com.example.demo.inventory.application.dto.PropertyDTO;
import com.example.demo.inventory.domain.model.Property;
import com.example.demo.inventory.rest.controller.InventoryRestController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;

/**
 * Created by Meri on 08-Mar-17.
 */
@Service
public class PropertyAssembler extends ResourceAssemblerSupport<Property, PropertyDTO> {
    public PropertyAssembler() {
        super(InventoryRestController.class, PropertyDTO.class);
    }

    public PropertyDTO toResource(Property p) {
        PropertyDTO dto = createResourceWithId(p.getId(), p);
        dto.setPrice(p.getPrice());
        dto.setCity(p.getCity());
        dto.setStreetAddress(p.getStreetAddress());
        dto.setArea(p.getArea());
        dto.setFloor(p.getFloor());
        dto.setAmenities(p.getAmenities());
        dto.setServices(p.getServices());

        return dto;
    }

    public Property toEntity(PropertyDTO pDTO) {
        Property p = Property.of(pDTO.get_id(), pDTO.getPrice(), pDTO.getCity(), pDTO.getStreetAddress(), pDTO.getArea(), pDTO.getFloor(), pDTO.getAmenities(), pDTO.getServices());
        return p;
    }
}
