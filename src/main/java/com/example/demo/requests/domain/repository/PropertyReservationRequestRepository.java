package com.example.demo.requests.domain.repository;

import com.example.demo.inventory.domain.model.Property;
import com.example.demo.requests.domain.model.PropertyReservationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Meri on 09-Jun-17.
 */
@Repository
public interface PropertyReservationRequestRepository extends JpaRepository<PropertyReservationRequest, String> {
}
